import Note.Contracts.INoteStorage;
import Note.ListImpliment.NoteStorage;
import View.UiConsole;

public class Main {
    public static void main(String[] args) {
        INoteStorage noteStorage = new NoteStorage();
        UiConsole ui = new UiConsole(noteStorage);
    }
}