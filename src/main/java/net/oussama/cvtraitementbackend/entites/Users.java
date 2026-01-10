package net.oussama.cvtraitementbackend.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.oussama.cvtraitementbackend.enums.AccountState;

import java.util.Date;

@Entity
@Data @AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;
    private Date creationDate;
    private Date modificationDate;
    private Date deletionDate;
    private AccountState active;
    @ManyToOne
    private CompanyWorkspace companyWorkspace;
    @ManyToOne
    private Role role;
}
