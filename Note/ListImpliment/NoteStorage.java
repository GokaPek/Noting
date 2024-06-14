package Note.ListImpliment;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import Note.Contracts.INote;
import Note.Contracts.INoteStorage;

public class NoteStorage implements INoteStorage {
    private List<INote> notes = new ArrayList<>();
    private String path = "data.dat";

    public NoteStorage() {
        load(path);
    }

    @Override
    public void addNote(INote note) {
        notes.add(note);
        save(path);
    }

    @Override
    public List<INote> getAll() {
        return notes;
    }

    public void save(String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(notes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            notes = (List<INote>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}