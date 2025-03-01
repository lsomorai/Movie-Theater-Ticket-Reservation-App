/*
 * UserRepository.java
 * Author: Cory Wu
 * Date: 2024-11-22
 * ENSF 614 2024
*/

package com.example.movieticket.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.antlr.v4.runtime.atn.SemanticContext.AND;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.movieticket.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.username = ?1 AND u.password=?2")

    List<User> findByUsernamePassword(String username, String password);

    @Query("SELECT u FROM User u WHERE u.username = ?1")
    List<User> findByUsername(String username);

    @Query("SELECT u FROM User u WHERE u.usertype = ?1 AND u.email IS NOT NULL")
    List<User> findByUserType(String userType);

}