package net.oussama.cvtraitementbackend.services;

import org.springframework.http.ResponseCookie;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jose.jws.MacAlgorithm;
import org.springframework.security.oauth2.jwt.JwsHeader;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class JwtServices {
    private final JwtEncoder jwtEncoder;

    public JwtServices(JwtEncoder jwtEncoder) {
        this.jwtEncoder = jwtEncoder;
    }

    public Map<String,String> SetJwt(Authentication authentication){
        Instant instant = Instant.now();
        String scope = authentication.getAuthorities().stream().map(a ->a.getAuthority()).collect(Collectors.joining(" "));
        JwtClaimsSet jwtClaimsset= JwtClaimsSet.builder()
                .issuedAt(instant)
                .expiresAt(instant.plus(10, ChronoUnit.MINUTES))
                .subject(authentication.getName())
                .claim("scope",scope)
                .build();
        JwtEncoderParameters jwtEncoderParameters=JwtEncoderParameters.from(JwsHeader.with(MacAlgorithm.HS512).build(),jwtClaimsset);
        String jwt = jwtEncoder.encode(jwtEncoderParameters).getTokenValue();
        return Map.of("token",jwt);
    }
}
