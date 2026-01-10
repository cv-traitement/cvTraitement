package net.oussama.cvtraitementbackend.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.oussama.cvtraitementbackend.enums.RoleUsers;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private RoleUsers name;
    private Date creationDate;
    private Date modificationDate;
    private Date deletionDate;
    @OneToMany(mappedBy = "role")
    private List<Users> users;
}
