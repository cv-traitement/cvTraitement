package net.oussama.cvtraitementbackend.repositroy;

import net.oussama.cvtraitementbackend.entites.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepositroy extends JpaRepository<Departement, Long> {
}
