package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import javax.annotation.PostConstruct;





@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private static final String envtemplate = "Hello from %s environment!";
    
    @Value("${environment}") 
    private String environment;
    
    //@PostConstruct
    private void init() {
      System.out.println(environment);
    } 

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

    @RequestMapping("/hello")
    public Greeting hello(String env) {
        
        
        return new Greeting(counter.incrementAndGet(),
                            String.format(envtemplate, environment));
    }

  


    
}
