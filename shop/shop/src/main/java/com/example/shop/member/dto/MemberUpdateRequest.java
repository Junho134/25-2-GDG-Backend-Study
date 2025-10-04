package com.example.shop.member.dto;

import lombok.Getter;

//비번, 전화번호, 주소
@Getter
public class MemberUpdateRequest {

    private Long password;
    private String phoneNumber;
    private String address;

    public MemberUpdateRequest(Long password, String phoneNumber, String address) {
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
