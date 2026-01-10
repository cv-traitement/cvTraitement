package net.oussama.cvtraitementbackend.dtos;

import lombok.Data;
import net.oussama.cvtraitementbackend.enums.StateContactUs;

import java.util.Date;
@Data
public class Dtocontact{
    private String Name;
    private String email;
    private String message;
    private String phone;
    private StateContactUs stateContactUs;
}
