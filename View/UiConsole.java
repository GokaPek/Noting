package View;
import java.util.List;
import java.util.Scanner;

import Note.Contracts.INote;
import Note.Contracts.INoteStorage;
import Note.ListImpliment.Note;

public class UiConsole {

    public UiConsole(INoteStorage noteStorage) {
        Scanner scan = new Scanner(System.in);
        PrintComands();
        
        while (true) {
            System.out.print("Input:  ");
            String command = scan.nextLine();
            if (command.startsWith("#write")) {
                String text = command.substring(7).trim();
                noteStorage.addNote(new Note(text));
            } else if (command.equals("#read")) {
                List<INote> notes = noteStorage.getAll();
                for (INote note : notes) {
                    System.out.println(note.getText() + ": " + note.getTime());
                }
            } else if (command.equals("#statistics")) {
            }
            else if (command.equals("#comands")) {
                PrintComands();
            }
            
        }
    }

    public void PrintComands(){
        System.out.println("Управление:");
        System.out.println("#write + текст - создать запись");
        System.out.println("#read - вывести все записи");
        System.out.println("#comands - показать эти команды");
        System.out.println("#statistics - показать статистику");
    }
}
