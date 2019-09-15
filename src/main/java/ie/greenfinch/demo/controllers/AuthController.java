package ie.greenfinch.demo.controllers;

import static org.springframework.http.ResponseEntity.ok;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ie.greenfinch.demo.models.User;
import ie.greenfinch.demo.services.UserServiceImpl;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
	@Autowired
	private UserServiceImpl userService;
	 
	@PostMapping("/v1/register")
	public ResponseEntity registration(@RequestBody User user) {
		User userExists = userService.findByUsername(user.getUsername());
        if (userExists != null) {
            throw new BadCredentialsException("User with username: " + user.getUsername() + " already exists");
        }
        userService.save(user);
        Map<Object, Object> model = new HashMap<>();
        model.put("message", "User registered successfully");
        return ResponseEntity.ok(model);
    }
	
	@GetMapping("v1/checkUsernameExists")
	  public boolean checkUsernameExists(@RequestParam("username") String username) {
	    return userService.isUsernameAvailable(username);
	  }
}