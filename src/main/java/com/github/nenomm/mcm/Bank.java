package com.github.nenomm.mcm;

public class Bank {
    Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
