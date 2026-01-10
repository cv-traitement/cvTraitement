package net.oussama.cvtraitementbackend.services.contact;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import net.oussama.cvtraitementbackend.dtos.Dtocontact;
import net.oussama.cvtraitementbackend.entites.ContactUs;
import net.oussama.cvtraitementbackend.mappers.Dtomappers;
import net.oussama.cvtraitementbackend.repositroy.ContactRepositroy;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Transactional
public class ContactServiceImpl implements ContactServices{
    private ContactRepositroy contactRepositroy;
    private Dtomappers dtomappers;
    @Override
    public Dtocontact createContactUs(Dtocontact dtocontact) {
      ContactUs contactUs = dtomappers.convertDtocontactToContactUs(dtocontact);
      ContactUs contactUs1 = contactRepositroy.save(contactUs);
      return dtomappers.convertContactToDtocontact(contactUs1);
    }
}
