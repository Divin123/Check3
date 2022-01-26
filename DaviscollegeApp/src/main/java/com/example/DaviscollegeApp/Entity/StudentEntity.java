package com.example.DaviscollegeApp.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", nullable = false, unique = true)
    Integer StudentId;
    @Column(name = "student_name", nullable = false, unique = true)
    String StudentName;
    @Column(name = "student_email", nullable = false, unique = true)
    String StudentEmail;
    @Column(name = "student_phone", nullable = false, unique = true)
    String StudentPhone;

}
