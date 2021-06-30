package neurgo.games.backend.services;

import neurgo.games.backend.repositories.UserRepository;
import neurgo.games.backend.resources.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User insertUserData(User user) {
        return userRepository.insert(user);
    }

    public Optional<User> getUserInformationById(String id) {
        return userRepository.findById(id);
    }

    public User updateUserUsingId(String id, User user) {
        Optional<User> findUserQuery = userRepository.findById(id);
        User userValues = findUserQuery.get();
        userValues.setId(user.getId());
        userValues.setUserName(user.getUserName());
        userValues.setEmail(user.getEmail());
        return userRepository.save(userValues);
    }

    public void deleteUserUsingId(String id) {
        try {
            userRepository.deleteById(id);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
}
