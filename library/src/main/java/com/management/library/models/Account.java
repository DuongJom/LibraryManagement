package com.management.library.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document("accounts")
public class Account extends BaseModel{
    @Id
    private Long Id;
    private String Username;
    private String Password;
    private String Avatar;
    private boolean IsActive;
}
