package kdh.practice.restAPI.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class infoController {
    @GetMapping("/info")
    public String info() {
        return "Project introduce info";
    }
}
