package com.ks12dev.socialmedia.repository;

import com.ks12dev.socialmedia.model.Post;
import com.ks12dev.socialmedia.model.User;
import com.ks12dev.socialmedia.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}