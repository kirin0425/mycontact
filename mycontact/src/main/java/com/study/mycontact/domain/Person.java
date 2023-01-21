package com.study.mycontact.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private  String name;

    @NonNull
    private  int age;

    private String hobby;

    private String bloodType;

    private String address;

    private LocalDate birthdate;

    private String jop;

    @ToString.Exclude
    private String phoneNumber;

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        Person person = (Person) object;

        if (!person.getName().equals(this.getName())) {
            return false;
        }

        if (person.getAge() != this.getAge()) {
            return false;
        }

        return true;
    }
}
