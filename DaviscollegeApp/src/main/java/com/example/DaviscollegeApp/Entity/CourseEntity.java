package com.example.DaviscollegeApp.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CourseEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name ="course_id", nullable = false, unique =true)
        Integer Course_Id;
        @Column(name ="course_name", nullable = false, unique = true)
        String CourseName;
        @Column(name ="course_details", nullable = false, unique = true)
        String course_details;

    }