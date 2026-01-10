package net.oussama.cvtraitementbackend.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity @NoArgsConstructor @AllArgsConstructor
public class CompanyWorkspace {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String email;
    @OneToMany(mappedBy = "companyWorkspace")
    private List<Users> user;
    @OneToMany(mappedBy = "companyWorkspace")
    private List<Departement>  departement;
    @OneToMany(mappedBy = "companyWorkspace")
    private List<Candidature> candidature;
    @OneToOne
    private Licence licence;
}
