package org.example.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@RequiredArgsConstructor

public class MemberDto {

    @Email
    @Schema(description = "이메일", example = "jj1234@naver.com")
    private String email;

    @Schema(description = "이름",example = "김민우")
    private String name;

    @Schema(description = "비밀번호",example = "영문,숫자,특수기호 포함8자리이상")
    private String password;


    @Schema(description = "프로필 사진")
    private String image;

    @JsonProperty("nick_name")
    @Schema(description = "닉네임")
    private String nickName;

    private int follower;
    private int following;
    @Builder
    public MemberDto(String email, String nickName,String image, String name,String password,int follower,int following){
        this.email=email;
        this.nickName=nickName;
        this.image = image;
        this.name=name;
        this.password=password;
        this.follower=follower;
        this.following=following;
    }

}
