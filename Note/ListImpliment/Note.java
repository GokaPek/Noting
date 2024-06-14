package Note.ListImpliment;

import java.io.Serializable;
import java.time.LocalDateTime;

import Note.Contracts.INote;

public class Note implements INote, Serializable {
    private String text;
    private LocalDateTime time;

    public Note(String text) {
        this.text = text;
        this.time = LocalDateTime.now();
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public LocalDateTime getTime() {
        return time;
    }
}