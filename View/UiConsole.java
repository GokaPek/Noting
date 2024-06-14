package View;
import java.util.Scanner;

public class UiConsole {
    // ...

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("> ");
            String command = scanner.nextLine();
            if (command.startsWith("#write")) {
                String text = command.substring(7).trim();
                //noteBook.addNote(new Note(text));
            } else if (command.equals("#read")) {
                // List<Note> notes = noteBook.getNotes();
                // for (Note note : notes) {
                //     System.out.println(note.getText() + " - " + note.getTimestamp());
                // }
            } else if (command.equals("#statistics")) {
                // Реализация статистики
            }
        }
    }
}
