package com.edu.userms.api;

	
import com.edu.userms.model.User;
import com.edu.userms.repo.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
public class UserResource {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserResource.class);
	@Autowired
	private UserRepo repo;

	@GetMapping("/hello")
	public String getHello() {
		return "Hello World!";
	}

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return repo.findAll();
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<User> findUserById(@PathVariable Integer id) {
		Optional<User> userOpt = repo.findById(id);
		if (userOpt.isPresent()) {
			LOGGER.info("User found with id {}", id);
			return ResponseEntity.ok(userOpt.get());
		}
		LOGGER.error("User not found with id {}", id);
		return ResponseEntity.notFound().build();
	}

//	@GetMapping("/users/{name}")
//	public ResponseEntity<User> findUserByName(@PathVariable String name) {
//		Optional<User> userOpt = repo.findByName(name);
//		if (userOpt.isPresent()) {
//			LOGGER.info("User found with id {}", name);
//			return ResponseEntity.ok(userOpt.get());
//		}
//		LOGGER.error("User not found with id {}", name);
//		return ResponseEntity.notFound().build();
//	}
	
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user) throws URISyntaxException {
		User userSaved = repo.save(user);

		return ResponseEntity.created(new URI(userSaved.getId().toString())).body(userSaved);
	}

}
