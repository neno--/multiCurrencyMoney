package com.github.nenomm.mcm;

public class Franc extends Money {
    Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    String currency() {
        return currency;
    }
}
