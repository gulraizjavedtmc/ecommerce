package com.gulraiz.user.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gulraiz.common.ApiResponse;
import com.gulraiz.user.model.UserProfile;
import com.gulraiz.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired private UserService userService;

	@GetMapping("/")
	public ResponseEntity<List<UserProfile>> getUsers() {
		List<UserProfile> dtos = userService.listProfiles();
		return new ResponseEntity<List<UserProfile>>(dtos, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<ApiResponse> addSurvey(@RequestBody @Valid UserProfile profile) {
		userService.addProfile(profile);
		return new ResponseEntity<>(new ApiResponse(true, "Profile has been created."), HttpStatus.CREATED);
	}	
}
