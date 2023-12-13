package ser.game;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ser.game.listener.console.CommandLineLoop;

@SpringBootApplication
@AllArgsConstructor
public class ColiseumApplication implements CommandLineRunner {

    private final CommandLineLoop commandLineLoop;
    private final ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        SpringApplication.run(ColiseumApplication.class, args);
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