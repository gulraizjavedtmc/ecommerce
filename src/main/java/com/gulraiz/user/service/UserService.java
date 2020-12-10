package com.gulraiz.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gulraiz.user.model.UserProfile;
import com.gulraiz.user.repository.UserProfileRepository;

@Service
public class UserService {

	@Autowired private UserProfileRepository userRepo;
	

	public void addProfile(UserProfile userProfile) {
		userRepo.save(userProfile);
	}
	
	public List<UserProfile> listProfiles(){
		return userRepo.findAll();		
	}
	
}
