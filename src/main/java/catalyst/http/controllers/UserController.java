package catalyst.http.controllers;

import catalyst.user.commands.CreateCommand;
import catalyst.user.models.User;
import catalyst.user.repositories.UserRepository;
import catalyst.user.services.Creator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rgb on 4/9/15.
 */

@RestController
@RequestMapping("/api/1.0/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Creator creator;

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @RequestMapping(value = "user", method = RequestMethod.POST)
    public User create(
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password,
            @RequestParam(value = "repeat_password") String repeat_password
    ) {

        CreateCommand command = new CreateCommand();

        command.setUsername(username);
        command.setPassword(password);
        command.setRepeat_password(repeat_password);

        return creator.execute(command);
    }

}
