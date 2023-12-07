package ser.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ser.game.listener.console.CommandLineLoop;

import java.io.IOException;
import java.util.Arrays;

@SpringBootApplication
public class ColiseumApplication implements CommandLineRunner {

    @Autowired
    private CommandLineLoop commandLineLoop;
    @Autowired
    private ConfigurableApplicationContext ctx;

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