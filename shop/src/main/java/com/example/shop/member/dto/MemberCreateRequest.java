package com.example.shop.member.dto;

//로그인 아이디(고유식별자)(자동생성), 비번, 전화번호, 주소, 포인트(필요없음)
import lombok.Getter;

@Getter
public class MemberCreateRequest {

    private String loginId;
    private String password;
    private String phoneNumber;
    private String address;

    public MemberCreateRequest(String loginId, String password, String phoneNumber, String address) {
        this.loginId = loginId;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
