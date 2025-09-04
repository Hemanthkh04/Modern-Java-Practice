package Streams.Streams_TerminalOperations;

import data.StudentDataBase;

import static java.util.stream.Collectors.counting;

public class StreamsCountingExample {

    public long count(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .collect(counting());
    }

    public  void Example(){
        System.out.println(count());
    }
}
