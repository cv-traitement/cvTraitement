package net.oussama.cvtraitementbackend.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Licence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Licence;
    @OneToOne
    @JoinColumn(name = "company_workspace_id",unique = true)
    private CompanyWorkspace companyWorkspace;
}
