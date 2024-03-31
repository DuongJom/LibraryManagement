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
@Document("books")
public class Book extends BaseModel{
    @Id
    private Long Id;
    private String Title;
    private LocalDateTime PublishDate;
    private int NumberOfPage;
    private boolean IsAvailable;
    private LocalDateTime InDate;
    private LocalDateTime OutDate;
    private int Quantity;

    @DBRef
    private List<Author> Authors;
    @DBRef
    private List<BookType> Types;
}
