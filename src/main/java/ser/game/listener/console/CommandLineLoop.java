package ser.game.listener.console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ser.game.ColiseumService;
import ser.game.user.User;

import java.io.*;
import java.util.Scanner;

@Component
public class CommandLineLoop {

    @Autowired
    private Scanner scanner;
    @Autowired
    private ColiseumService coliseumService;

    public boolean run() throws Exception {
        coliseumService.sayHello();
        coliseumService.enterNickName();
        while(true) {
            System.out.print("> ");
            String line = scanner.next();
            if (line.isEmpty()) {
                continue;
            } else {
                User user = new User().setNickName(line);
                FileOutputStream outputStream = new FileOutputStream("C:\\Users\\admin\\IdeaProjects\\coliseum\\src\\main\\resources\\savings\\users.ser");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeObject(user);
                objectOutputStream.close();
                FileInputStream fileInputStream = new FileInputStream("C:\\Users\\admin\\IdeaProjects\\coliseum\\src\\main\\resources\\savings\\users.ser");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                User user2 = (User) objectInputStream.readObject();

                System.out.println(user2);
            }
            if (line.toLowerCase().startsWith("exit")) {
                break;
            }
        }
        return false;
    }
}