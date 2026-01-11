package net.oussama.cvtraitementbackend.repositroy;

import net.oussama.cvtraitementbackend.entites.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoleRepository extends JpaRepository<Role,Long> {
    @Query("select r from Role r WHERE r.id=:kw")
      Role findRoleById(@Param("kw") Long id);
}
