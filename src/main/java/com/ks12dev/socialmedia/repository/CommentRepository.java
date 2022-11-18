package com.ks12dev.socialmedia.repository;

import com.ks12dev.socialmedia.model.Comment;
import com.ks12dev.socialmedia.model.Post;
import com.ks12dev.socialmedia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}