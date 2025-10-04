package com.example.shop.member;

import java.util.List;


import com.example.shop.member.dto.MemberCreateRequest;
import com.example.shop.member.dto.MemberUpdateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Long createMember(MemberCreateRequest request){
        Member existingMember = memberRepository.findByLoginId(request.getLoginId());
        if(existingMember != null){
            throw new RuntimeException("Member already exists" + request.getLoginId());
        }

        Member member = new Member(
                request.getLoginId(),
                request.getPassword(),
                request.getPhoneNumber(),
                request.getAddress()
        );

        MemberRepository.save(member);

        return member.getId();
    }

    public List<Member> getAllMembers(){
        return memberRepository.findAll();
    }

    public Member getMemberById(Long id){
        Member member = memberRepository.findById(id);

        if(member == null){
            throw new RuntimeException("Member not found");
        }

        return member;
    }

    public void updateMember(Long id, MemberUpdateRequest request){
        Member member = memberRepository.findById(id);

        if(member == null){
            throw new RuntimeException("Member not found");
        }

        member.updateInfo(request.getPassword(), request.getPhoneNumber(), request.getAddress());
    }

    public void deleteMember(Long id){
        Member member = memberRepository.findById(id);

        if(member == null){
            throw new RuntimeException("Member not found");
        }

        memberRepository.deleteById(id);
    }
}
