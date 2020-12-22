package com.company;

import java.io.IOException;

public interface LoggerStrategy {
    String execute(String message) throws IOException;
}
