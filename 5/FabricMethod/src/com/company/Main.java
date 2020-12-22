package com.company;

import javax.xml.crypto.Data;
import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Main {

    public static void main(String[] args) {
	    DataBase DataBase = new DataBase();
        List<Table> Table = new ArrayList<>();
        Table.add(DataBase.createTable(TableType.Student));
        Table.add(DataBase.createTable(TableType.Teacher));
        Table.add(DataBase.createTable(TableType.Course));
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("users.tsv")))
        {
            for (int i = 0; i < Table.size(); i++)
            {
                bw.write(String.valueOf(Table.get(i)+"\n\n"));
            }
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

abstract class Table {
    String name; //Название таблицы
    List<String> attribute = new ArrayList<>(); //Название аттрибута

    public String toString(){
        return name +"\n" + attribute;
    }
}

enum TableType {
    Student,
    Teacher,
    Course
}

class DataBase {
    public Table createTable(TableType type) {
        Table Table = null;
        switch (type) {
            case Student:
                Table = new Student();
                break;
            case Teacher:
                Table = new Teacher();
                break;
            case Course:
                Table = new Course();
                break;
        }
        return Table;
    }

}

class Student extends Table {
    public Student() {
        name = "Student";
        attribute.add("id");
        attribute.add("name");
        attribute.add("courses");
    }
}

class Teacher extends Table {
    public Teacher() {
        name = "Teacher";
        attribute.add("id");
        attribute.add("exp");
        attribute.add("name");
        attribute.add("courses");
    }
}

class Course extends Table {
    public Course() {
        name = "Course";
        attribute.add("id");
        attribute.add("name");
        attribute.add("teacher-id");
        attribute.add("students-id");
    }
}
