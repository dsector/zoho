package catalyst.user.commands;

import catalyst.common.Command;

/**
 * Created by rgb on 4/9/15.
 */
public class CreateCommand implements Command {

    private String username;

    private String password;

    private String repeat_password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeat_password() {
        return repeat_password;
    }

    public void setRepeat_password(String repeat_password) {
        this.repeat_password = repeat_password;
    }
}
