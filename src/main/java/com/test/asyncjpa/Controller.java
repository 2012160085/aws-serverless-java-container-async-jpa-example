package com.test.asyncjpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class Controller {

    @GetMapping("/hello")
    public CompletableFuture<String> hello() {
        return CompletableFuture.supplyAsync(() -> "Hello World");
    }
}
