package Note.Contracts;

import java.time.LocalDateTime;

public interface INote {
    String getText();
    void setText(String text);
    LocalDateTime getTime();
}
