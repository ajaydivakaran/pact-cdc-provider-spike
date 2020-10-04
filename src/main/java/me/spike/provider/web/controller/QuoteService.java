package me.spike.provider.web.controller;

import me.spike.provider.web.contract.Quote;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {

    public Quote getQuote(String id) {
        return new Quote("random message", id);
    }
}
