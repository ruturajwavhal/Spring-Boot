package StoreController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class HelloController {

    public String sayHello() {

        return "Hello,Spring Boot !";
    }
}
