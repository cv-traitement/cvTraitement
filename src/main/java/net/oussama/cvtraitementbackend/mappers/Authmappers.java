package net.oussama.cvtraitementbackend.mappers;

import net.oussama.cvtraitementbackend.dtos.DtoAuth;
import net.oussama.cvtraitementbackend.entites.Users;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class Authmappers {
    public Users convertDtoAuthtoUsers(DtoAuth dtoAuth) {
        Users users = new Users();
        BeanUtils.copyProperties(dtoAuth, users);
        return users;
    }
    public DtoAuth convertUsersToDtoAuth(Users users) {
        DtoAuth dtoAuth = new DtoAuth();
        BeanUtils.copyProperties(users, dtoAuth);
        return dtoAuth;
    }
}
