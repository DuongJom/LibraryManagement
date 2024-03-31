package com.management.library.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document("borrowed-books")
public class BorrowedBook extends BaseModel{
    @Id
    private Long Id;
    private LocalDateTime BorrowedDate;
    private LocalDateTime ReturnedDate;

    @DBRef
    private List<Book> Books;
    @DBRef
    private User User;
}
