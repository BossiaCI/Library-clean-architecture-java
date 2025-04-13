package com.library.application.usecases;

import com.library.domain.models.Member;
import com.library.domain.interfaces.MemberRepository;

public class RegisterMemberUseCase {
    private final MemberRepository memberRepository;

    public RegisterMemberUseCase(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void registerMember(Member member) {
        memberRepository.save(member);
    }
}
