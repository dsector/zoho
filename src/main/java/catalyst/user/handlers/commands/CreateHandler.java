package catalyst.user.handlers.commands;

import catalyst.common.Command;
import catalyst.common.CommandHandler;
import catalyst.user.commands.CreateCommand;
import catalyst.user.models.User;
import catalyst.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rgb on 4/9/15.
 */
@Service
public class CreateHandler implements CommandHandler<User, CreateCommand> {

    @Autowired
    UserRepository userRepository;

    public User execute(CreateCommand command) {
        User user = new User();
        user.setPassword(command.getPassword());
        user.setUsername(command.getUsername());

        return userRepository.save(user);
    }
}
