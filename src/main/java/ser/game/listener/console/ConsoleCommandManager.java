package ser.game.listener.console;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ser.game.listener.BaseCommandManager;

import java.util.Scanner;

@Component
@AllArgsConstructor
public class ConsoleCommandManager extends BaseCommandManager {

    private final Scanner scanner;

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
