package org.example;
import java.util.logging.Level;
import java.util.logging.Logger;
 public class Student {
     private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
     private String studentName;
     private char gradeLevel;
     private float gPA;

     Student(String name, char gr, float gp) {
         studentName = name;
         gradeLevel = gr;
         gPA = gp;
     }


     public void update(float gpa) {
         gPA = gpa;
         LOGGER.log(Level.INFO, "The updated Gpa is");
         LOGGER.log(Level.INFO, Double.toString(gPA), "The updated Gpa is");
     }

     public String nameAndgPA() {
         String res = "";
         res = String.format("%s has a %.1f GPA", studentName, gPA);
         return res;
     }
 }