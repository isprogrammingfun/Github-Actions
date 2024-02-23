package com.nanal.server.service;

import com.nanal.server.domain.Member;
import com.nanal.server.repository.MemberRepository;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public void saveMember() {
        memberRepository.save(new Member("test"));
    }
}
