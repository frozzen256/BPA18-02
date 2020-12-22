package com.company;

import java.io.IOException;

public class Context {
    private LoggerStrategy strategy;

    public void setStrategy(LoggerStrategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(String message) throws IOException {
        return strategy.execute(message);
    }
}
