package ser.game.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan("ser.game.config")
public class ConsoleCommandConfig {

    @Bean
    public Scanner scanner(){
        return new Scanner(System.in);
    }

}
