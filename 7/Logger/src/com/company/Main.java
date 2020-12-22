package com.company;

import javax.naming.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        String text = "Hello, world!";
        Context context = new Context();

        context.setStrategy(new ConsoleLogger());
        String strategy1 = context.executeStrategy(text);

        context.setStrategy(new SimpleFileLogger());
        strategy1 = context.executeStrategy(text);

        context.setStrategy(new TimeFiledLogger());
        strategy1 = context.executeStrategy(text);
    }
}
