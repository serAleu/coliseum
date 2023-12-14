package ser.game.listener.web;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping
    public ResponseEntity<String> getRequest() {
        log.info("WoW i intercepted the GET request");
        return ResponseEntity.ok().body("Please, use POST request");
    }
}
