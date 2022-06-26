package com.example.appadv.proj1.repository;

import com.example.appadv.proj1.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long>{

}
