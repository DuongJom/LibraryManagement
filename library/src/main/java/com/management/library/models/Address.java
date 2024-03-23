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
@Document("addresses")
public class Address extends BaseModel{
    @Id
    private Long Id;
    private String Street;
    private String Ward;
    private String District;
    private String City;
    private String Country;
}
