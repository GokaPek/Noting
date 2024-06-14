package Note.Contracts;

import java.util.List;

public interface INoteStorage {
    void addNote(INote note);
    List<INote> getAll();
}