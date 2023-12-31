package com.restaurant.repository;



import com.restaurant.entity.Member;
import com.restaurant.entity.Rest;
import com.restaurant.entity.Star;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StarRepository extends JpaRepository<Star, Integer> {
    Star findByMemberAndRest(Member member , Rest rest);

    List<Star> findByMember(Member member);
}
