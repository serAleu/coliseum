package ser.game.listener.console;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import ser.game.listener.BaseCommandService;

import java.util.Scanner;

@Component
@AllArgsConstructor
@Profile("console")
public class ConsoleCommandService extends BaseCommandService implements CommandLineRunner {

    private final Scanner scanner;
    private final CommandLineLoop commandLineLoop;
    private final ConfigurableApplicationContext ctx;

    @Override
    public void listen() {

    }

    @Override
    public void write() {
        System.out.print("Enter your name: ");
        String username = scanner.next();
        System.out.println(username);
    }

    @Override
    public void run(String... args) {
        try {
            if(!commandLineLoop.run()) {
                System.exit(SpringApplication.exit(ctx));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
