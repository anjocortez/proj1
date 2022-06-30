package com.example.appadv.proj1.model;

import com.example.appadv.proj1.dto.UserDTO;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    @CreationTimestamp
    private String emailAddress;

    private LocalDateTime dateTime;

    @Column
    @CreationTimestamp
    private LocalDateTime dateUpdated;

    public User() {}



    public User(UserDTO userDTO){
        this.id = userDTO.getId();
        this.fullName = userDTO.getFullName();
        this.userName = userDTO.getUserName();
        this.password = userDTO.getPassword();
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id){this.id = id;}

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(LocalDateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }


}
