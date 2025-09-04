package Streams.Streams_TerminalOperations;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collector;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamsSumAvgExample {

    public int sum(){
        return StudentDataBase.getAllStudents().stream()
                .collect(summingInt(Student::getNoteBooks));
    }

    public double average(){
        return StudentDataBase.getAllStudents().stream()
                .collect(averagingInt(Student::getNoteBooks));
    }




    public void Example(){
        System.out.println("Total number of books: " + sum());
        System.out.println("Avergae number of books: " + average());
    }
}
