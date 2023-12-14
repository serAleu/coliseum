package ser.game.listener.web;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@AllArgsConstructor
@RequestMapping(path = "coliseum/game")
@RestController
@Profile("web")
@Slf4j
public class WebCommandController {

    private final WebCommandService webCommandService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<String> start(@RequestBody String string) {
        log.info("Run DMS requestId ");
        webCommandService.listen();
        return ResponseEntity.ok().body("Please, use get request");
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
