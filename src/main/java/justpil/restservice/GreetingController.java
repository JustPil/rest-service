package justpil.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String TEMPLATE = "Hello, %s!";
    private final AtomicLong COUNTER = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "User") String name) {
        return new Greeting(COUNTER.incrementAndGet(), String.format(TEMPLATE, name));
    }
}
