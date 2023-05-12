package com.example.backend.repository;

import com.example.backend.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
    @Query("SELECT p FROM Post p WHERE p.user.id = :userId")
    List<Post> findAllByUserId(@Param("userId") Long userId);

}
