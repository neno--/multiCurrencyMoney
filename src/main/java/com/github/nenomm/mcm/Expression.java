package com.github.nenomm.mcm;

public interface Expression {
    Money reduce(Bank bank, String to);
}
