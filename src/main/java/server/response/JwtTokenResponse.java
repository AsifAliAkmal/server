package server.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtTokenResponse {

    private String accessToken;

    private String tokenType="Bearer";

    private Long jwtExpirationDateTime;

    public  JwtTokenResponse(String accessToken,Long jwtExpirationDateTime){
        this.accessToken = accessToken;
        this.jwtExpirationDateTime = jwtExpirationDateTime;
    }
}
