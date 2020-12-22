package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeFiledLogger implements LoggerStrategy {
    public String execute(String message) throws IOException {
        DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.now();
        File file = new File("Message.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.write(message);
        writer.flush();
        writer.close();
        System.out.println(time);
        return message;
    }
}
