package singleresponsibility;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int id;
    private String fullname;
    private List<Double> grades;

    public Student() {
        this.fullname = "";
        this.grades = new ArrayList<>();
    }

    public Student(int id, String fullname, List<Double> grades) {
        this.id = id;
        this.fullname = fullname;
        this.grades = grades;
    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public List<Double> getGrades() {
        return grades;
    }
}
