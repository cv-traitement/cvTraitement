package net.oussama.cvtraitementbackend.dtos;

import jakarta.persistence.ManyToOne;
import lombok.Data;
import net.oussama.cvtraitementbackend.entites.CompanyWorkspace;
import net.oussama.cvtraitementbackend.entites.Role;
import net.oussama.cvtraitementbackend.enums.AccountState;

import java.util.Date;

@Data
public class UsersDto {
    private String username;
    private String email;
    private String password;
    private AccountState active;
    private Long companyWorkspace;
    private Long role;
}
