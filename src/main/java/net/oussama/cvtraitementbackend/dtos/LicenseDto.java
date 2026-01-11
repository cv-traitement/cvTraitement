package net.oussama.cvtraitementbackend.dtos;

import jakarta.persistence.OneToOne;
import net.oussama.cvtraitementbackend.entites.CompanyWorkspace;

public class LicenseDto {
    private String Licence;
    private CompanyWorkspace companyWorkspace;
}
