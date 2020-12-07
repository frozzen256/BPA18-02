import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class LStrategy {

    public static void main(String[] args) throws IOException {
        String text = "Какой-то там текст";
        ContextStrategy context = new ContextStrategy(new TimedFileLogger());
        String s = context.getText(text);
        System.out.println(s);
    }
}

interface Strategy {
    String getText(String s) throws IOException;
}

class ColsoleLogger implements Strategy {
    @Override
    public String getText(String s) {
        System.out.println(s);
        return s;
    }
}

class SimpleFileLogger implements Strategy {
    @Override
    public String getText(String s) throws IOException {
        File file = new File("Text.txt");

        // Создание файла
        file.createNewFile();

        // Создание объекта FileWriter
        FileWriter writer = new FileWriter(file);

        // Запись содержимого в файл
        writer.write(s);
        writer.flush();
        writer.close();

        return s;
    }
}

class TimedFileLogger implements Strategy {
    @Override
    public String getText(String s) throws IOException {

        // Инициализация объекта date
        Date date = new Date();

        File file = new File("TimeText.txt");

        // Создание файла
        file.createNewFile();

        // Создание объекта FileWriter
        FileWriter writer = new FileWriter(file);

        // Запись содержимого в файл
        writer.write(date.toString() + "\n" + s);
        writer.flush();
        writer.close();

        return s;
    }
}

class ContextStrategy {
    Strategy strategy;

    public ContextStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String getText (String s) throws IOException {
        return strategy.getText(s);
    }
}
