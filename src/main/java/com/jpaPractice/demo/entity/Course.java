package com.jpaPractice.demo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Getter
@Setter
public class Course {
    @Id
    private long id;
    private String title;
    private String description;

//    public Course(long id, String title, String description) {
//        this.id = id;
//        this.title = title;
//        this.description = description;
//    }
}
