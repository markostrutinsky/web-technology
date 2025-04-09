package com.strutynskyi.ssl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/name")
    public String getFullName() {
        return "Marko Strutynskyi KP-21";
    }
}