package org.example;

import java.util.Stack;

public class Student {

     private  int id;
     private  String name;

     private static String Progrm;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static String getProgrm() {
        return Progrm;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setProgrm(String progrm) {
        Progrm = progrm;
    }

static {
    Progrm = "CSE" ;
}
}
