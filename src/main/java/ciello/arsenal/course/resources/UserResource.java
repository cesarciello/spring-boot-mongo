package ciello.arsenal.course.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ciello.arsenal.course.dto.UserDTO;
import ciello.arsenal.course.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	UserService userService;

	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() {
		var users = userService.findAll();
		var usersDto = users.stream().map(user -> { return new UserDTO(user); }).collect(Collectors.toList());
		return ResponseEntity.ok().body(usersDto);
	}
}
