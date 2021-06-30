package neurgo.games.backend.controllers;

import neurgo.games.backend.resources.User;
import neurgo.games.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {



    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.insertUserData(user);
    }

    @GetMapping
    public Optional<User> getUser(@RequestParam String userID) {
        return userService.getUserInformationById(userID);
    }

    @PutMapping
    public User updateUser(@RequestParam String userID, @RequestBody User user) {
        return userService.updateUserUsingId(userID, user);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam String userID) {
        userService.deleteUserUsingId(userID);
    }
}
