package com.company;

public class ConsoleLogger implements LoggerStrategy {
    public String execute(String message){
        System.out.println(message);
        return message;
    }
}
