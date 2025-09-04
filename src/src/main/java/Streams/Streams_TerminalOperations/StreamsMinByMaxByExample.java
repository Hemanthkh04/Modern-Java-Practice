package Streams.Streams_TerminalOperations;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;


import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamsMinByMaxByExample {

    public Optional<Student> minBy_Example(){
        return StudentDataBase.getAllStudents().stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    public Optional<Student> maxBy_Example(){
        return StudentDataBase.getAllStudents().stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }

    public  void Example(){
        System.out.println(minBy_Example());
        System.out.println(maxBy_Example());
    }
}
