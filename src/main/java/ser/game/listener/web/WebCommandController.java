package ser.game.listener.web;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ser.game.user.User;

import java.util.Map;

@AllArgsConstructor
@RequestMapping(path = "/coliseum/game")
@Controller
@Profile("web")
@Slf4j
public class WebCommandController {

    private final WebCommandService webCommandService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<String> start(@RequestBody String string) {
        webCommandService.listen();
        return ResponseEntity.ok().body("Please, use get request");
    }

    @GetMapping("")
    public String greeting(Model model) {
        User user = new User()
                .setNickName("serserser");
        model.addAttribute("user", user);
        return "greeting";
    }

    @PostMapping("/register")
    public String register(@RequestParam(name="nickname", required=false, defaultValue="Sergei") String nickname, Model model) {
        User user = new User().setNickName(nickname);
        model.addAttribute("user", user);
//        model.addAttribute("nickname", nickname);
        return "greeting";
    }

//    @GetMapping("")
//    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
//        model.addAttribute("name", name);
//        return "greeting";
//    }
}
