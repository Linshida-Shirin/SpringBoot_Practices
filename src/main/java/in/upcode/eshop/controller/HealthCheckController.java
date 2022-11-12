package in.upcode.eshop.controller;

import in.upcode.eshop.model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HealthCheckController {
    @GetMapping("/health")
    public String health() {
        return "Health OK";
    }


}
