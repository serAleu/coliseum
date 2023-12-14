package ser.game;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Profile;
import ser.game.listener.console.CommandLineLoop;

@SpringBootApplication
@AllArgsConstructor
public class ColiseumApplication {

    public static void main(String[] args) {
        SpringApplication.run(ColiseumApplication.class, args);
    }
}