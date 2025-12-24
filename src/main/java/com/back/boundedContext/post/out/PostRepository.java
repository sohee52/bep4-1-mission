package com.back.boundedContext.post.out;

import com.back.boundedContext.post.domain.Post;
import com.back.boundedContext.post.domain.PostMember;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Integer> {
    public interface PostMemberRepository extends JpaRepository<PostMember, Long> {
        Optional<PostMember> findByUsername(String username);
    }
}
