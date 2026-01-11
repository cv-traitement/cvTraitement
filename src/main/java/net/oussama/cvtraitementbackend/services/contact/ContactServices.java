package net.oussama.cvtraitementbackend.services.contact;

import net.oussama.cvtraitementbackend.dtos.Dtocontact;
import net.oussama.cvtraitementbackend.entites.ContactUs;

import java.util.List;

public interface ContactServices {
    Dtocontact createContactUs(Dtocontact dtocontact);
    List<Dtocontact> getAllcontacts();
}
