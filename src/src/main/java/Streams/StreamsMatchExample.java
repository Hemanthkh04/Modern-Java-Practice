package Streams;

import data.StudentDataBase;

public class StreamsMatchExample {

    public boolean allMatch(){
        return StudentDataBase.getAllStudents().stream().allMatch((student -> student.getGpa()>=3.5));
    }

    public boolean anyMatch(){
        return StudentDataBase.getAllStudents().stream().anyMatch((student -> student.getGpa()>=4.0));
    }

    public boolean noneMatch(){
        return StudentDataBase.getAllStudents().stream().noneMatch((student -> student.getGpa()>=4.1));
    }

    public void Example(){
        System.out.println("The result of All match: " + allMatch());
        System.out.println("The result of Any match: " + anyMatch());
        System.out.println("The result of None match: " + noneMatch());

    }
}
