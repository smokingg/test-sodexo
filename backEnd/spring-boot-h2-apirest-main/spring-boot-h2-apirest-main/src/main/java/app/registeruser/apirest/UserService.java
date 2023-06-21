package app.registeruser.apirest;

import app.registeruser.apirest.model.User;
import app.registeruser.apirest.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createuser(User user){
        return userRepository.save(user);
    }

    public User getUserById(Long id){
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.get();
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
