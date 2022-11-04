package com.nanal.server.controller;

import com.nanal.server.domain.Member;
import com.nanal.server.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberRepository memberRepository;

    @GetMapping("/save")
    public String SaveMember(){
        memberRepository.save(new Member("test"));
        return "test success";
    }
}
