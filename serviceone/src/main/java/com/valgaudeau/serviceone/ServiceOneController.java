package com.valgaudeau.serviceone;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-one")
class ServiceOneController {

    @GetMapping("/call-service-one")
    public String callServiceOne() {
        return "hi from service one";
    }
}
