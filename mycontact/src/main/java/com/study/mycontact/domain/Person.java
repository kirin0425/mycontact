package com.study.mycontact.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
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
}
