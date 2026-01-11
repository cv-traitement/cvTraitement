package net.oussama.cvtraitementbackend.repositroy;

import net.oussama.cvtraitementbackend.entites.CompanyWorkspace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CompanyWorkspaceRepositroy extends JpaRepository<CompanyWorkspace, Long> {
    @Query("select c from CompanyWorkspace c WHERE c.id=:kw")
    CompanyWorkspace findCompanyWorkspaceByIdById(@Param("kw") Long id);
}
