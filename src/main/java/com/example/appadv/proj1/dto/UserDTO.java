package com.example.appadv.proj1.dto;

import com.example.appadv.proj1.model.User;

public class UserDTO {

    private Long id;
    private String userName;
    private String fullName;
    private String password;

   public UserDTO() {}

    public UserDTO(Long id, String userName, String fullName, String password) {
        this.id = id;
        this.userName = userName;
        this.fullName = fullName;
        this.password = password;
    }

    public UserDTO(User user) {
        this.id = user.getId();
        this.userName = user.getUserName();
        this.password = user.getPassword();
        this.fullName = user.getFullName();

    }

    public Long getId() {return id; }

    public void setId(Long id) {this.id = id; }

    public String getUserName() {return userName;}
    public void setUserName(String userName) {this.userName = userName;}

    public String getFullName() {return fullName;}
    public void setFullName(String fullName) {this.fullName = fullName;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}
}
