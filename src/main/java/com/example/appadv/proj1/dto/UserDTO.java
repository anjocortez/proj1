package com.example.appadv.proj1.dto;

public class UserDTO {

    private String userName;
    private String fullName;
    private String password;

    public UserDTO() {}

    public UserDTO(String userName, String fullName, String password){

        this.userName = userName;
        this.fullName = fullName;
        this.password = password;
    }

    public String getUserName() {return userName;}
    public void setUserName(String userName) {this.userName = userName;}
    public String getFullName() {return fullName;}
    public void setFullName(String fullName) {this.userName = fullName;}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.userName = password;}
}
