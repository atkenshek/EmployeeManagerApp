package com.atkenshek.employeemanager.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
        nullable = false,
        updatable = false
    )
    private Long id;

    @Column(
        name = "name",
        columnDefinition = "TEXT"
    )
    private String name;

    @Column(
        name = "email",
        columnDefinition = "TEXT"
    )
    private String email;

    @Column(
        name = "job_title",
        columnDefinition = "TEXT"
    )
    private String jobTitle;

    @Column(
        name = "phone_number",
        columnDefinition = "TEXT"
    )
    private String phone;

    @Column(
        name = "image_url",
        columnDefinition = "TEXT"
    )
    private String imageUrl;

    @Column(
        name = "employee_code",
        nullable = false,
        updatable = false)
    private String employeeCode;
}
