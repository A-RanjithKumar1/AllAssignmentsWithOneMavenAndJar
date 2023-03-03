package org.example;

import java.util.List;
import java.util.logging.Logger;

public class StudentGpa {
    private String name;
    private int age;
    private float gpa;
    private static final Logger LOG = Logger.getLogger("InfoLogging");

    static String s;

    StudentGpa(String name, int age, float gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getGpa() {
        return gpa;
    }

    public static void printDetails(List<StudentGpa> al) {
        for (StudentGpa st : al) {
            LOG.info(st.getName() + ", " + st.getAge() + ", " + st.getGpa());
        }
    }
}
