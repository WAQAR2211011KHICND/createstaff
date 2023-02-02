package com.xloop.createstaff.Model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Entity
@Table(name = "staff_data")
public class CreateStaff {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String firstName;
    @Setter
    private String lastName;
    @Setter
    private String email;
    @Setter
    private Long cnic;
    @Setter
    private String gender;
    @Column(columnDefinition = "date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Setter
    private Date date_of_birth;
    @Setter
    private String password;
    @Setter
    private String designation;
    @Setter
    private String role;


    public CreateStaff(){}
    public CreateStaff(String firstName, String lastName, String email,
    Long cnic, String gender, Date date_of_birth, String password,
    String designation, String role){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.cnic = cnic;
        this.gender = gender;
        this.date_of_birth = date_of_birth;
        this.password = password;
        this.designation = designation;
        this.role = role;

    }
    
}
