package net.oussama.cvtraitementbackend.repositroy;

import io.swagger.v3.oas.annotations.info.Contact;
import net.oussama.cvtraitementbackend.entites.ContactUs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepositroy extends JpaRepository<ContactUs, Long> {
}
