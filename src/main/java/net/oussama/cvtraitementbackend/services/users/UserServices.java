package net.oussama.cvtraitementbackend.services.users;

import net.oussama.cvtraitementbackend.dtos.DtoAuth;
import net.oussama.cvtraitementbackend.dtos.UsersDto;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserServices {
    UsersDto createUsers(UsersDto usersDto);
    List<UsersDto> getAllUsers();
    UserDetails checkUser(DtoAuth auth);

}
