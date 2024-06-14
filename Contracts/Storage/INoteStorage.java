package Contracts.Storage;

import java.util.List;

import Contracts.DataModels.INoteModel;

public interface INoteStorage {
    void addNote(INoteModel note);
    List<INoteModel> getNotes();
    int count();
    //INoteModel getMostRecentNote();
}