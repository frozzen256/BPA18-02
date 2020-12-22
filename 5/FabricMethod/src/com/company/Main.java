package com.company;

import javax.xml.crypto.Data;
import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Main {

    public static void main(String[] args) {
	    DataBase DataBase = new DataBase();
        Table Table;
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("users.tsv")))
        {
            Table = DataBase.createTable(TableType.Student);
            bw.write(String.valueOf(Table+"\n\n"));
            Table = DataBase.createTable(TableType.Teacher);
            bw.write(String.valueOf(Table+"\n\n"));
            Table = DataBase.createTable(TableType.Course);
            bw.write(String.valueOf(Table+"\n\n"));
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        //System.out.println(myStudent);
        //System.out.println(myTeacher);
        //System.out.println(myCourse);
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
