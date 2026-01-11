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
    @Column(nullable = true)
    private Date creationDate;
    @Column(nullable = true)
    private Date modificationDate;
    @Column(nullable = true)
    private Date deletionDate;
    @OneToMany(mappedBy = "role")
    private List<Users> users;
}
