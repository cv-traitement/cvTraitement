package net.oussama.cvtraitementbackend.services.users;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import net.oussama.cvtraitementbackend.dtos.DtoAuth;
import net.oussama.cvtraitementbackend.dtos.UsersDto;
import net.oussama.cvtraitementbackend.entites.CompanyWorkspace;
import net.oussama.cvtraitementbackend.entites.Role;
import net.oussama.cvtraitementbackend.entites.Users;
import net.oussama.cvtraitementbackend.mappers.Authmappers;
import net.oussama.cvtraitementbackend.mappers.Dtomappers;
import net.oussama.cvtraitementbackend.repositroy.CompanyWorkspaceRepositroy;
import net.oussama.cvtraitementbackend.repositroy.RoleRepository;
import net.oussama.cvtraitementbackend.repositroy.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
@Transactional
public class UserServiceImpl implements UserServices{
    private UserRepository userRepository;
    private Authmappers authmappers;
    private Dtomappers dtomappers;
    private PasswordEncoder passwordEncoder;
    private CompanyWorkspaceRepositroy companyWorkspaceRepositroy;
    private RoleRepository roleRepository;
    @Override
    public UsersDto createUsers(UsersDto usersDto) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        CompanyWorkspace companyWorkspace = companyWorkspaceRepositroy.findCompanyWorkspaceByIdById(usersDto.getCompanyWorkspace());
        Role role = roleRepository.findRoleById(usersDto.getRole());
        Users  newuser = new Users();
        newuser.setUsername(usersDto.getUsername());
        newuser.setPassword(passwordEncoder.encode(usersDto.getPassword()));
        newuser.setEmail(usersDto.getEmail());
        newuser.setActive(usersDto.getActive());
        newuser.setRole(role);
        newuser.setCompanyWorkspace(companyWorkspace);
        newuser.setCreationDate(new java.util.Date());
        userRepository.save(newuser);
        UsersDto usersDto1=dtomappers.convertuserDtotouser(newuser);
        return  usersDto1;
    }

    @Override
    public List<UsersDto> getAllUsers() {
        return List.of();
    }

    @Override
    public UserDetails checkUser(DtoAuth auth) {
        return null;
    }

}
