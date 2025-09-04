package Streams.ParallelStreams;

import data.Student;
import data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ParallelStreamExample1 {

    public List<String> printStudentActivitesSequential(){
        Long startTime = System.currentTimeMillis();
        List<String>studentActivities =  StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream)//Stream<String>
                .distinct()
                .sorted()
                .collect(toList());
        Long endTime  = System.currentTimeMillis();
        System.out.println("Duration to execute in sequential stream: " + (endTime - startTime));
        return studentActivities;
    }

    public List<String> printStudentActivitesParallel(){
        Long startTime = System.currentTimeMillis();
        List<String>studentActivities =  StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream)//Stream<String>
                .distinct()
                .sorted()
                .collect(toList());
        Long endTime  = System.currentTimeMillis();
        System.out.println("Duration to execute in parallel stream: " + (endTime - startTime));
        return studentActivities;
    }

    public void Example(){
        System.out.println("Sequential Stream: " + printStudentActivitesSequential());
        System.out.println("Parallel Stream: " + printStudentActivitesParallel());
    }
}
