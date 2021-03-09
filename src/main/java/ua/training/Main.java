package ua.training;

import ua.training.controller.SimpleController;
import ua.training.model.Note;

public class Main {

    public static void main(String[] args) {
    SimpleController controller = new SimpleController();
    controller.processUserInput();
        for (Note note:controller.getNotebook().getNoteList()) {
            System.out.println(note);
        }
    }
}
