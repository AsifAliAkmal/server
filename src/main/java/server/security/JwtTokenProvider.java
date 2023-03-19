//package server.security;
//
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Component;
//import server.response.JwtTokenResponse;
//
//import java.util.Date;
//import java.util.stream.DoubleStream;
//
//@Component
//public class JwtTokenProvider {
//
//
//    @Value("${app.jwtSecret}")
//    private String jwtSecret;
//
//    @Value("${app.jwtExpirationInMs}")
//    private Long jwtExpirationInMs;
//
//    public JwtTokenResponse generateJwtToken(Authentication authentication){
//        UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
//        Date now = new Date();
//        Date expiryDate = new Date(now.getTime()+jwtExpirationInMs);
//        String jwtToken = Jwts.builder()
//                .setSubject(Long.toString(userPrincipal.getId()))
//                .setIssuedAt(new Date())
//                .setExpiration(expiryDate)
//                .signWith(SignatureAlgorithm.HS512, jwtSecret)
//                .compact();
//        long jwtExpiryDateTime = expiryDate.getTime();
//        return new JwtTokenResponse(jwtToken, jwtExpiryDateTime);
//    }
//
//
//}
