package model;

import model.Epic;
import model.Task;

public class SubTask extends Task {
    Epic epic;
    public SubTask(long id, Epic epic) {
        super(id);
    }
}
