package management;

import model.Epic;
import model.Task;

import java.util.ArrayList;
import java.util.HashMap;

public class Manager {
    private HashMap<Long, Task> singleTasks = new HashMap<>();//создали список для задач
    private HashMap<Long, Epic> epics = new HashMap<>();//создали список для epic

    public void addTask(Task task) throws Exception { // добавление любой задачи
        for (Long id : singleTasks.keySet()) {
            if (task.getId() == id) {
                throw new Exception("Такой id уже существует.");
            }
        }
        singleTasks.put(task.getId(), task); // взял id у таски
    }

    public ArrayList<Task> getTasksList() { // получение списка всех задач
        return new ArrayList<>(singleTasks.values());
    }

    public Task getTaskById(long id) { //получение задачи на индентификатору
        for (long taskId : singleTasks.keySet()) {
            if (id == taskId) {
                singleTasks.get(id);
            }
        }
        return singleTasks.get(id);
    }

    public void updateTask(Task task, long id) {
        if (task == null) {
            System.out.println("Пустая задача");
        }
        for (long taskId : singleTasks.keySet()) {
            if (id == taskId) {
                singleTasks.put(taskId, task);
                System.out.println("Задача обновлена!");
                return;
            } else {
                System.out.println("Такой задачи нет.");
            }
        }
    }

    public void removeTask() { //удаление всех задач
        singleTasks.clear();
    }

    public void removeTaskById(long id) { // удаление задачи по идентификатору
        for (long taskId : singleTasks.keySet()) {
            if (id == taskId) {
                singleTasks.remove(taskId);
                return;
            }
        }
    }

    public void addEpic(Epic epic) throws Exception { // добавление model.Epic
        for (Long id : epics.keySet()) {
            if (epic.getId() == id) {
                throw new Exception("Такой id уже существует.");
            }
        }
        singleTasks.put(epic.getId(), epic); // взял id у model.Epic
    }

    public ArrayList<Epic> getEpicsList() { // получение списка всех model.Epic
        return new ArrayList<>(epics.values());
    }

    public Epic getEpicById(long id) { //получение model.Epic на индентификатору
        for (long epicId : epics.keySet()) {
            if (id == epicId) {
                epics.get(id);
            }
        }
        return epics.get(id);
    }

    public void updateEpic(Epic epic, long id) {
        if (epic == null) {
            System.out.println("Пустая задача");
        }
        for (long epicId : epics.keySet()) {
            if (id == epicId) {
                epics.put(epicId, epic);
                System.out.println("Задача обновлена!");
                return;
            } else {
                System.out.println("Такой задачи нет.");
            }
        }
    }

    public void removeEpics() { //удаление всех model.Epic
        epics.clear();
    }

    public void removeEpicById(long id) { // удаление model.Epic по идентификатору
        for (long epicId : epics.keySet()) {
            if (id == epicId) {
                epics.remove(epicId);
                return;
            }
        }
    }

    public HashMap<Long, Task> getSingleTasks() {
        return singleTasks;
    }

    public void setSingleTasks(HashMap<Long, Task> singleTasks) {
        this.singleTasks = singleTasks;
    }

    public HashMap<Long, Epic> getEpics() {
        return epics;
    }

    public void setEpics(HashMap<Long, Epic> epics) {
        this.epics = epics;
    }
}