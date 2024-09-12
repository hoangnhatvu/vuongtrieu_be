package com.vuongtrieu.vuongtrieu_be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VuongtrieuBeApplication {
    public static void main(String[] args) {
        SpringApplication.run(VuongtrieuBeApplication.class, args);
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Vũ") String name) {
        return String.format("Hello %s!", name);
    }
}
