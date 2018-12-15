package com.baizhi.git;

public class Student {
    private String name;
    private double score;
    private String classname;

    public Student() {
        super();
    }

    public Student(String name, double score, String classname) {
        this.name = name;
        this.score = score;
        this.classname = classname;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", classname='" + classname + '\'' +
                '}';
    }
}
