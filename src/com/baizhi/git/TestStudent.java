package com.baizhi.git;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

    public static void main(String[] args) {
        List<Student> s1 = new ArrayList<>();
        s1.add(new Student("lcy",100.0,"c1"));
        s1.add(new Student("lim",45,"c2"));
        s1.add(new Student("sxl",70,"c1"));
        s1.add(new Student("nsp",75,"c2"));
        List<Student> s2 = printStudent(s1,(student) -> student.getScore()>60 && student.getClassname().equals("c1"));
        for (Student student : s2) {
            System.out.println(student.toString());
        }


    }
    static List<Student> printStudent(List<Student> ss,Test03 t){
        List<Student> list = new ArrayList<>();
             for (Student student : ss) {
               if(t.test1(student)) list.add(student);
        }
        return  list;
    }

}
