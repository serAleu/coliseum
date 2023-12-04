package ser.game;

import org.springframework.stereotype.Service;

@Service
public class ColiseumService {

    public void sayHello() {
        System.out.println("Welcome to the Coliseum game!");
    }

    public void enterYourName() {
        System.out.println("Enter your name: ");
    }

}
