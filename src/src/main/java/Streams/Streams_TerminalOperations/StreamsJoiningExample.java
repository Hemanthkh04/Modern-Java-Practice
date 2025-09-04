package Streams.Streams_TerminalOperations;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {

    public String joining_1(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public String joining_2(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public String joining_3(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-","(",")"));
    }

    public void Example(){
        System.out.println("joining_1: " + joining_1());
        System.out.println("joining_2: " + joining_2());
        System.out.println("joining_3: " + joining_3());
    }
}
