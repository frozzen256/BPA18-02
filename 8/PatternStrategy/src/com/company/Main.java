package com.company;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите какой - либо текст");
        String text = scanner.nextLine();

        Context context = new Context();

        context.setStrategy(new ConsoleLogger());
        String s1 = context.executeStrategy(text);

        context.setStrategy(new SimpleFileLogger());
        s1 = context.executeStrategy(text);

        context.setStrategy(new TimeFiledLogger());
        s1 = context.executeStrategy(text);
    }
}

interface LoggerStrategy {
    String execute(String textLog);
}

class ConsoleLogger implements LoggerStrategy {
    public String execute(String textLog){
        System.out.println(textLog);
        return textLog;
    }
}

class SimpleFileLogger implements LoggerStrategy {
    public String execute(String textLog){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Log.txt")))
        {
            bw.write(textLog);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        return textLog;
    }
}

class TimeFiledLogger implements LoggerStrategy {
    public String execute(String textLog){
        Date date = new Date();
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("LogTime.txt")))
        {
            bw.write(date.toString() + " " + textLog);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        return textLog;
    }
}

class Context {
    private LoggerStrategy strategy;

    public void setStrategy(LoggerStrategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(String textLog) {
        return strategy.execute(textLog);
    }
}



