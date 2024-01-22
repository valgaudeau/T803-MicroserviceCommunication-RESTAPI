package com.valgaudeau.serviceone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/service-one")
class ServiceOneController {

    @GetMapping("/call-service-two")
    public String callServiceTwo() {
        return "hi from service one";
    }
}
