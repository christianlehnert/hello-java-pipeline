package io.github.christianlehnert.hello;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

    @GetMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
    String hello() {
        return "Hello from Java";
    }

    @GetMapping(value = "/health", produces = MediaType.TEXT_PLAIN_VALUE)
    String health() {
        return "UP";
    }
}
