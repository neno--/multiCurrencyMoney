package com.github.nenomm.mcm;

public class Dollar extends Money {
    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }

    @Override
    String currency() {
        return currency;
    }
}
