package com.example.oa2;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String gender;


}

