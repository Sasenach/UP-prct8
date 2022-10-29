package com.example.prct5.Repository;

import com.example.prct5.Models.Password;
import org.springframework.data.repository.CrudRepository;

public interface PasswordRepository extends CrudRepository<Password, Long> {
    Password findByPasswordName(String passwordName);
}
