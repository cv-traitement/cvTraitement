package net.oussama.cvtraitementbackend.repositroy;

import net.oussama.cvtraitementbackend.entites.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByEmail(String email);
}
