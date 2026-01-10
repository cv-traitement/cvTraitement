package net.oussama.cvtraitementbackend.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.oussama.cvtraitementbackend.enums.StatusCondidat;

import java.util.Date;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
public class Candidature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private StatusCondidat condidatstatus;
    private Date creationDate;
    private Date modificationDate;
    private Date deletionDate;
    @ManyToOne
    private Candidature candidat;
    @ManyToOne
    private CompanyWorkspace companyWorkspace;
    @ManyToOne
    private Poste poste;
}
