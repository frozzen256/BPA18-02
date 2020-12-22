package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.*;

public class SimpleFileLogger implements LoggerStrategy {
    public String execute(String message) throws IOException {
        File file = new File("Message.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.write(message);
        writer.flush();
        writer.close();
        return message;
    }
}
