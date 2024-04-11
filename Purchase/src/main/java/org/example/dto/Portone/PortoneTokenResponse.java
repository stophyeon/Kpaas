package org.example.dto.Portone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PortoneTokenResponse {

    private String accessToken ;
    private String refreshToken ;
}