package org.example.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Schema(description = "팔로우")
public class FollowDto {
    @Schema(description = "이메일", example = "jj1234@naver.com")
    private String email;
}