package com.example.appadv.proj1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.appadv.proj1.services.UserService;
import com.example.appadv.proj1.dto.UserDTO;


@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping
    private String list(Model model) {
        model.addAttribute("users", userService.list());
        return "user/index";
    }

    @GetMapping("/login")
    private String getUserAddForm(Model model) {
        model.addAttribute("user", new UserDTO());
        return "user/login";
    }

    @PostMapping
    private String add(UserDTO user, Model model) {
        userService.add(user);
        return list(model);
    }


    @PutMapping
    private String updateUser(UserDTO user, Model model) {
        userService.update(user);
        return list(model);
    }

    @DeleteMapping
    private String deleteUser(UserDTO user, Model model) {
        userService.delete(user.getId());
        return list(model);
    }

}
