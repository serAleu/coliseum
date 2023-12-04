package ser.game.listener.console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ser.game.listener.BaseCommandManager;

import java.util.Scanner;

@Component
public class ConsoleCommandManager extends BaseCommandManager {

    @Autowired
    private Scanner scanner;

    @Override
    public void listen() {

    }

    @Override
    public void write() {
        System.out.print("Enter your name: ");
        String username = scanner.next();
        System.out.println(username);
    }
}
