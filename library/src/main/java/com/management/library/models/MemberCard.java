package com.management.library.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document("member-cards")
public class MemberCard extends BaseModel{
    @Id
    private Long Id;
    private LocalDateTime RegisterDate;
    private LocalDateTime ExpiredDate;
    private boolean Status;

    @DBRef
    private User User;
}
