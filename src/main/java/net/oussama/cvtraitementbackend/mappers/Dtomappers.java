package net.oussama.cvtraitementbackend.mappers;

import net.oussama.cvtraitementbackend.dtos.Dtocontact;
import net.oussama.cvtraitementbackend.entites.ContactUs;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class Dtomappers {
    public Dtocontact convertContactToDtocontact(ContactUs contactus) {
        Dtocontact dtocontact = new Dtocontact();
        BeanUtils.copyProperties(contactus, dtocontact);
        return dtocontact;
    }
    public ContactUs convertDtocontactToContactUs(Dtocontact dtocontact) {
        ContactUs contactUs = new ContactUs();
        BeanUtils.copyProperties(dtocontact, contactUs);
        return contactUs;
    }
}
