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

    public void tryToAddNote(Note note) throws NotUniqueLoginException {
        for (DBEmulation dbEntry:DBEmulation.values()) {
            if (note.getNick().equals(dbEntry.getLogin())){
                noteList.add(note);
            }
            else throw new NotUniqueLoginException("This login already exists ",note.getNick());
        }

    }


}
