package hello;

import org.springframework.stereotype.*
import org.springframework.beans.factory.annotation.*

@Component
public class Environment {

    @Value("${environment}")
    private String env;

    public String getEnv() {
      return this.env
    }

    

    // ...
    //
}
