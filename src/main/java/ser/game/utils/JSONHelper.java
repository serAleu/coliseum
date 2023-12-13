package ser.game.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import ser.game.config.ProjectVars;
import ser.game.user.User;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
@AllArgsConstructor
public class JSONHelper {

    private final ProjectVars projectVars;
    private final ObjectMapper mapper;

    public void saveUserToJSON(User user) throws Exception {
//        mapper.writeValue(new File(projectVars.getSerializationFile()), user);
//        mapper.writeValue(new File(projectVars.getSerializationFile()), new User().setNickName("skks"));
        Files.write(new File(projectVars.getSerializationFile()).toPath(), Collections.singletonList(user.toString()), StandardOpenOption.APPEND);
    }

    public User checkUsers(String nickName) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(new File(projectVars.getSerializationFile()), User.class);
        return user;
    }

    @Getter
    @Setter
    private static class Users {
        private List<User> userList;
    }
}
