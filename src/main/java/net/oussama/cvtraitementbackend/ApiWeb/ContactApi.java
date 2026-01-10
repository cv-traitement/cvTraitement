package net.oussama.cvtraitementbackend.ApiWeb;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.oussama.cvtraitementbackend.dtos.Dtocontact;
import net.oussama.cvtraitementbackend.entites.ContactUs;
import net.oussama.cvtraitementbackend.services.contact.ContactServiceImpl;
import net.oussama.cvtraitementbackend.services.contact.ContactServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@NoArgsConstructor
@RestController
public class ContactApi {
    @Autowired
    private ContactServices contactServices;

    @PostMapping("/Contact")
    public Dtocontact createContactUs(@RequestBody Dtocontact contactUs) {
        return  contactServices.createContactUs(contactUs);
    }
}
