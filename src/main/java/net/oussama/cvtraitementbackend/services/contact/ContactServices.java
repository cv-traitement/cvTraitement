package net.oussama.cvtraitementbackend.services.contact;

import net.oussama.cvtraitementbackend.dtos.Dtocontact;
import net.oussama.cvtraitementbackend.entites.ContactUs;

public interface ContactServices {
    Dtocontact createContactUs(Dtocontact dtocontact);
}
