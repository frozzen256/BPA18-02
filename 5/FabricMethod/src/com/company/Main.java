package com.company;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Main {
    public static void main(String[] args) {
	    DataBase DataBase = new DataBase();

        Table myStudent = DataBase.getStudent();
        Table myTeacher = DataBase.getTeacher();
        Table myCourse = DataBase.getCourse();

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("users.tsv")))
        {
            bw.write(String.valueOf(myStudent+"\n\n"));
            bw.write(String.valueOf(myTeacher+"\n\n"));
            bw.write(String.valueOf(myCourse+"\n\n"));
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        System.out.println(myStudent);
        System.out.println(myTeacher);
        System.out.println(myCourse);
    }
}

abstract class Table {
    String name; //Название таблицы
    List<String> attribute = new ArrayList<>(); //Название аттрибута

    public String toString(){
        return name +"\n" + attribute;
    }
}


class DataBase {
    public Table getStudent() {
        return new Student();
    }

    public Table getTeacher() {
        return new Teacher();
    }

    public Table getCourse() {
        return new Course();
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
