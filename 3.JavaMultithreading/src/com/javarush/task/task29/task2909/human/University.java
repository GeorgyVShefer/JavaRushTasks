package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University  {
    private String name;
    private int age;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    private List<Student> students = new ArrayList<>();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double avgGrade) {
        //TODO:
        for (Student student : students){
            if(student.getAverageGrade() == avgGrade){
                return student;
            }
        }
        return null;
    }

     public Student getStudentWithMaxAverageGrade() {
        if(students.size() > 0){
            Student studentWithMaxAvgGrade = students.get(0);
            double maxAvgGradeStudent = studentWithMaxAvgGrade.getAverageGrade();
            for (Student student : students){
                if(student.getAverageGrade() > maxAvgGradeStudent){
                    studentWithMaxAvgGrade = student;
                    maxAvgGradeStudent = student.getAverageGrade();
                }
            }return studentWithMaxAvgGrade;
        }
        return null;
    }

    public Student getStudentWithMinAverageGrade() {
        if (students.size() > 0) {
            Student studentWithMinAverageGrade = students.get(0);
            double maxAverageGrade = studentWithMinAverageGrade.getAverageGrade();

            for (Student student : students) {
                if (student.getAverageGrade() < maxAverageGrade) {
                    studentWithMinAverageGrade = student;
                    maxAverageGrade = student.getAverageGrade();
                }
            }
            return studentWithMinAverageGrade;
        }
        return null;
    }
    public void expel(Student student){
        students.remove(student);
    }
}
/*
if (students.size() > 0) {
        Student studentWithMaxAverageGrade = students.get(0);
        double maxAverageGrade = studentWithMaxAverageGrade.getAverageGrade();

        for (Student student : students) {
        if (student.getAverageGrade() > maxAverageGrade) {
        studentWithMaxAverageGrade = student;
        maxAverageGrade = student.getAverageGrade();
        }
        }
        return studentWithMaxAverageGrade;
        }
        return null;*/
