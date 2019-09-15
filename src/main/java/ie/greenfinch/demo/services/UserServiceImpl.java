package ie.greenfinch.demo.services;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ie.greenfinch.demo.models.User;
import ie.greenfinch.demo.repository.UserRepository;

	@Service
	public class UserServiceImpl implements UserService {
	    @Autowired
	    private UserRepository userRepository;

	    @Override
	    public void save(User user) {
	        userRepository.save(user);
	    }

	    @Override
	    public User findByUsername(String username) {
	        return userRepository.findByUsername(username);
	    }
	    
	    public boolean isUsernameAvailable(String username) {
	        User user = userRepository.findByUsername(username);
	        System.out.println(user);
	        if(user == null) {
	        	return true;
	        } else {
	        	return false;
	        }
	    }
}
