package me.spike.provider.web.controller;

import me.spike.provider.web.contract.Quote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class QuoteController {

    @GetMapping("/quote")
    public Quote quote() {
        return new Quote("Some random message", UUID.randomUUID().toString());
    }
}
