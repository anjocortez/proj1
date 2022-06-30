package com.example.appadv.proj1.services;

import com.example.appadv.proj1.dto.AdminDTO;
import java.util.List;

public interface AdminService {

    List<AdminDTO> list();

    void add(AdminDTO admin);

    AdminDTO get(Long id);

    void update(AdminDTO updatedAdmin);

    void delete(Long id);
}