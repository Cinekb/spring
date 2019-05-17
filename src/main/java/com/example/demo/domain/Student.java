package com.example.demo.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Student {

  static   Integer index=1;
    String name;
    String lastname;
    Integer age;

    public Student(String name, String lastname, Integer age) {
        this.index++;
        this.name = name;
        this.lastname = lastname;
        this.age = age;


    }

}
