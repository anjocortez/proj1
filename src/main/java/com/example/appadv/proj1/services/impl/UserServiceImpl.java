package com.example.appadv.proj1.services.impl;
import com.example.appadv.proj1.dto.UserDTO;
import com.example.appadv.proj1.model.User;
import com.example.appadv.proj1.repository.UserRepository;
import com.example.appadv.proj1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserDTO> list() {
        return StreamSupport.stream(userRepository.findAll().spliterator(), false)
                .map(UserDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public void add(UserDTO userDTO) {
        userRepository.save(new User(userDTO));
    }

    @Override
    public UserDTO get(Long id) {
        return new UserDTO(userRepository.findById(id).get());
    }

    @Override
    public void update(UserDTO updatedUser) {
        userRepository.save(new User(updatedUser));
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

}
