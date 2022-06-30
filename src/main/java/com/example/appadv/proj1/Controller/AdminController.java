package com.example.appadv.proj1.Controller;
import com.example.appadv.proj1.dto.AdminDTO;
import com.example.appadv.proj1.dto.UserDTO;
import com.example.appadv.proj1.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping
    private String list(Model model) {
        model.addAttribute("users", adminService.list());
        return "admin/index";
    }

    @GetMapping("/add")
    private String getAdminAddForm(Model model) {
        model.addAttribute("user", new AdminDTO());
        return "user/add-user";
    }

    @PostMapping
    private String add(AdminDTO user, Model model) {
        adminService.add(user);
        return list(model);
    }

    @PutMapping
    private String updateUser(AdminDTO user, Model model) {
        adminService.update(user);
        return list(model);
    }

    @DeleteMapping
    private String deleteUser(AdminDTO user, Model model) {
        adminService.delete(user.getId());
        return list(model);
    }

}