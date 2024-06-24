package edu.tiago.coin_exchange.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ExchangeController {

    private static final Map<String, String> CURRENCY_SYMBOLS = new HashMap<>();

    static {
        CURRENCY_SYMBOLS.put("USD", "$");
        CURRENCY_SYMBOLS.put("BRL", "R$");
        CURRENCY_SYMBOLS.put("EUR", "€");
    }

    @GetMapping("/exchange/{amount}/{from}/{to}/{rate}")
    public Map<String, Object> convertCurrency(@PathVariable double amount,
                                               @PathVariable String from,
                                               @PathVariable String to,
                                               @PathVariable double rate) {
        double convertedAmount = amount * rate;
        String symbol = CURRENCY_SYMBOLS.get(to.toUpperCase());

        Map<String, Object> response = new HashMap<>();
        response.put("valorConvertido", convertedAmount);
        response.put("simboloMoeda", symbol);

        return response;
    }
}
