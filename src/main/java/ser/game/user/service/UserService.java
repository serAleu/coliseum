package ser.game.user.service;

import org.springframework.stereotype.Service;
import ser.game.user.User;

@Service
public class UserService {

    private User user;

    public User getUser(String nickName) {
        return user;
    }
}
