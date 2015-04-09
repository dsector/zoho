package catalyst.user.services;

import catalyst.common.AppService;
import catalyst.common.Command;
import catalyst.user.commands.CreateCommand;
import catalyst.user.handlers.commands.CreateHandler;
import catalyst.user.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rgb on 4/9/15.
 */
@Service
public class Creator implements AppService<User, CreateCommand> {

    @Autowired
    CreateHandler createHandler;

    @Override
    public User execute(CreateCommand command) {

        //todo - validation

        //todo - fire an event

        return createHandler.execute(command);
    }
}
