package net.oussama.cvtraitementbackend.ApiWeb;

import lombok.AllArgsConstructor;
import net.oussama.cvtraitementbackend.dtos.DtoAuth;
import net.oussama.cvtraitementbackend.dtos.UsersDto;
import net.oussama.cvtraitementbackend.entites.Users;
import net.oussama.cvtraitementbackend.services.JwtServices;
import net.oussama.cvtraitementbackend.services.users.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@AllArgsConstructor
public class AuthApi {
    @Autowired
    private AuthenticationManager authenticationManager;
    private JwtServices jwt;
    @Autowired
    private UserServices userServices;
    @PostMapping("/auth/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody DtoAuth auth) {
        Authentication authentication=authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
               auth.getEmail(),
                auth.getPassword()
        ));
        Map<String,String> map = jwt.SetJwt(authentication);
        return ResponseEntity.ok(map);
    }
    @PostMapping("/creat/user")
    @PreAuthorize("hasAuthority('SCOPE_ROLE_ADMIN')")
    public UsersDto createUser(@RequestBody UsersDto user) {
        UsersDto usersDto= userServices.createUsers(user);
        return usersDto;
    }
}
