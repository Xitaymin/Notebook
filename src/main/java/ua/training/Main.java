package ua.training;

import ua.training.controller.Controller;
import ua.training.model.Note;

public class Main {

    public static void main(String[] args) {
    Controller controller = new Controller();
    controller.makeNote();
        for (Note note:controller.getNotebook().getNoteList()) {
            System.out.println(note);
        }
    }
}
