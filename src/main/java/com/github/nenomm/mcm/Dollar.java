package com.github.nenomm.mcm;

public class Dollar extends Money {
    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    String currency() {
        return currency;
    }
}
