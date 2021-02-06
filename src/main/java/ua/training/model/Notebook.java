package ua.training.model;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private List<Note> noteList;

    public Notebook() {
        this.noteList = new ArrayList<>();
    }

    public List<Note> getNoteList() {
        return noteList;
    }

    public void addNote(Note note) {
        noteList.add(note);
    }


}
