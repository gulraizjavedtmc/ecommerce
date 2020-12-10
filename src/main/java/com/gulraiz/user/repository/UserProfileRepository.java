package com.gulraiz.user.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gulraiz.user.model.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

}
