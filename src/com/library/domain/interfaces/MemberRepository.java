package com.library.domain.interfaces;

import com.library.domain.models.Member;
import java.util.Optional;

public interface MemberRepository {
    Optional<Member> findById(int id);
    void save(Member member);
}
