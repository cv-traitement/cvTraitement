package net.oussama.cvtraitementbackend.security;

import lombok.AllArgsConstructor;
import net.oussama.cvtraitementbackend.dtos.DtoAuth;
import net.oussama.cvtraitementbackend.entites.Role;
import net.oussama.cvtraitementbackend.entites.Users;
import net.oussama.cvtraitementbackend.enums.RoleUsers;
import net.oussama.cvtraitementbackend.repositroy.RoleRepository;
import net.oussama.cvtraitementbackend.repositroy.UserRepository;
import net.oussama.cvtraitementbackend.services.users.UserServices;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthUsers implements UserDetailsService {
    private UserServices userServices;
    private UserRepository  userRepository;
    private RoleRepository roleRepository;
    @Override
    public UserDetails loadUserByUsername(String Email) throws UsernameNotFoundException {
        Users user=userRepository.findByEmail(Email);
        Long role=user.getRole().getId();
        Role role_user=roleRepository.findRoleById(role);
        RoleUsers roles=role_user.getName();
        if(user==null){
            throw new UsernameNotFoundException(Email);
        }
            return org.springframework.security.core.userdetails.User
                    .withUsername(user.getEmail())
                    .password(user.getPassword())
                    .authorities("ROLE_"+roles)
                    .build();

    }
}
