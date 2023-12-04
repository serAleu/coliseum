package ser.game.listener.console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CommandLineLoop {

    @Autowired
    private Scanner scanner;

    public boolean run() {
        while(true) {
            System.out.print("> ");
            String line = scanner.next();
            if (line.isEmpty()) {
                continue;
            }
            if (line.toLowerCase().startsWith("exit")) {
                break;
            }
        }
        return false;
    }
}