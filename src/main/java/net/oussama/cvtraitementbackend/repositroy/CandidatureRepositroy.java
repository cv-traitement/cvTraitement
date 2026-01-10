package net.oussama.cvtraitementbackend.repositroy;

import net.oussama.cvtraitementbackend.entites.Candidature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatureRepositroy extends JpaRepository<Candidature, Long> {
}
