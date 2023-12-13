package ser.game.listener.console;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ser.game.ColiseumService;
import ser.game.config.ProjectVars;
import ser.game.user.User;
import ser.game.utils.JSONHelper;

import java.io.*;
import java.util.Scanner;

@Component
@AllArgsConstructor
@Slf4j
public class CommandLineLoop {

    private final Scanner scanner;
    private final ColiseumService coliseumService;
    private final ProjectVars projectVars;
    private final ObjectMapper mapper;
    private final JSONHelper jsonHelper;

    public boolean run() throws IOException, ClassNotFoundException {
        coliseumService.sayHello();
        coliseumService.enterNickName();
        while (true) {
            System.out.print("> ");
            String line = scanner.next();
            if (line.isEmpty()) {
                continue;
            } else {
                try {
                    User user = new User().setNickName(line);
                    jsonHelper.saveUserToJSON(user);
                    User user2 = jsonHelper.checkUsers(line);
                    System.out.println(user2);
                } catch (Exception e) {
                    log.error(e.getMessage());
                }
            }
            if (line.toLowerCase().startsWith("exit")) {
                break;
            }
        }
        return false;
    }
}