package ciello.arsenal.course.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ciello.arsenal.course.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		var user = new User("xpto", "Cesar", "cesar@mail.com");
		return ResponseEntity.ok().body(Arrays.asList(user));
	}
}
