package ciello.arsenal.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ciello.arsenal.course.domain.User;
import ciello.arsenal.course.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	UserService userService;

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		var users = userService.findAll();
		return ResponseEntity.ok().body(users);
	}
}
