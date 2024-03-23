package com.management.library.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BaseModel {
    private LocalDateTime CreatedDate = LocalDateTime.now();
    private User CreatedBy;
    private LocalDateTime ModifiedDate = LocalDateTime.now();
    private User ModifiedBy;

}
