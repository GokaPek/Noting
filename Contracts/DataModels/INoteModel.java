package Contracts.DataModels;

import java.time.LocalDateTime;

public interface INoteModel {
    String getText();
    void setText(String text);
    LocalDateTime getTimestamp();
    void setTimestamp(LocalDateTime timestamp);
}
