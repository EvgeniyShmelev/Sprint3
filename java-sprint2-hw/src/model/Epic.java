package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Epic extends Task {
    private HashMap<Long, SubTask> subTasks = new HashMap<>();//создали МАП для model.SubTask

    public Epic(long id) {
        super(id);
    }

    public ArrayList<SubTask> getSubTasksList() { // получение списка всех подзадач
        return new ArrayList<>(subTasks.values());
    }

    public Task getTaskById(long id) { //получение подзадачи на индентификатору
        for (long subTaskId : subTasks.keySet()) {
            if (id == subTaskId) {
                subTasks.get(id);
            }
        }
        return subTasks.get(id);
    }

    public void updateTask(SubTask subTask, long id) {
        if (subTask == null) {
            System.out.println("Пустая задача");
        }
        for (long subTaskId : subTasks.keySet()) {
            if (id == subTaskId) {
                subTasks.put(subTaskId, subTask);
                System.out.println("Задача обновлена!");
                return;
            } else {
                System.out.println("Такой задачи нет.");
            }
        }
    }

    public void removeTask(Epic epic) { //удаление всех подзадач у эпика
        subTasks.clear();
    }

    public void removeTaskById(long id) { // удаление подзадачи по идентификатору
        for (long subTaskId : subTasks.keySet()) {
            if (id == subTaskId) {
                subTasks.remove(subTaskId);
                return;
            } else {
                System.out.println("Задача не найдена");
            }
        }
    }

    public HashMap<Long, SubTask> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(HashMap<Long, SubTask> subTasks) {
        this.subTasks = subTasks;
    }
}
