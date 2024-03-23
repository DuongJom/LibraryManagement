package com.management.library.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document("authors")
public class Author extends BaseModel{
    @Id
    private Long Id;
    private String Name;
    private Date Birthday;
    private int NumberOfExperience;

    @DBRef
    private Address Address;
}
