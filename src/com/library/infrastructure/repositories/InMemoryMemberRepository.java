package com.library.infrastructure.repositories;

import com.library.domain.interfaces.MemberRepository;
import com.library.domain.models.Member;

import java.util.*;

public class InMemoryMemberRepository implements MemberRepository {
    private final Map<Integer, Member> members = new HashMap<>();

    @Override
    public Optional<Member> findById(int id) {
        return Optional.ofNullable(members.get(id));
    }

    @Override
    public void save(Member member) {
        members.put(member.getId(), member);
    }
}
