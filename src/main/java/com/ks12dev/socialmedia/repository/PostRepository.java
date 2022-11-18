package com.ks12dev.socialmedia.repository;

import com.ks12dev.socialmedia.model.Post;
import com.ks12dev.socialmedia.model.Subreddit;
import com.ks12dev.socialmedia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}