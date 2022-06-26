package com.example.appadv.proj1.services;

import com.example.appadv.proj1.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> list();

    void add(UserDTO user);

    UserDTO get(Long id);

    void update(UserDTO updatedUser);

    void delete(Long id);

}

