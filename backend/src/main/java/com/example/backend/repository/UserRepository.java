package com.example.backend.repository;

import com.example.backend.domain.Item;
import com.example.backend.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query("SELECT u.items FROM User u WHERE u.id = :userId")
    Set<Item> findItemsByUserId(@Param("userId") Long userId);
    User findByEmail(String email);
    boolean existsByEmail(String email);
    boolean existsByUserNickname(String userNickname);

    boolean deleteByEmail(String email);

}
