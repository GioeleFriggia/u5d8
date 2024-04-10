package gioelefriggia.u5d8.payload;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BlogPayload {
    private String category;
    private String title;
    private String cover;
    private String content;
    private double readingTime;
    private int authorId;
}
