package com.test.rest.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Test {
    @Id
    @GeneratedValue
    private long id;
    private String content;
    private String something;
    private int number;

    public Test() {
    }

    public Test(String content, String something, int number) {
        this.content = content;
        this.something = something;
        this.number = number;
    }
}
