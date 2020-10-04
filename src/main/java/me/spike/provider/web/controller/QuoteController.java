package me.spike.provider.web.controller;

import me.spike.provider.web.contract.Quote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

    private QuoteService service;

    public QuoteController(QuoteService service) {
        this.service = service;
    }

    @GetMapping("/quote")
    public Quote quote(@RequestParam(name = "id") String id) {
        return service.getQuote(id);
    }
}
