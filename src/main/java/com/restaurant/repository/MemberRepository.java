package com.restaurant.repository;

import com.restaurant.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member,Long> {
    Member findByEmail(String email);

    void deleteByEmail(String email);

}
