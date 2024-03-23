package com.management.library.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document("users")
public class User extends BaseModel{
    @Id
    private Long Id;
    private String Name;
    private boolean Sex;
    private Date Birthday;
    private String Email;
    private String PhoneNumber;
    private int UserRole;

    @DBRef
    private List<Address> Address;
    @DBRef
    private List<Account> Accounts;
}
