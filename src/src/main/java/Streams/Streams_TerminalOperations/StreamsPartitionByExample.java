package Streams.Streams_TerminalOperations;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPartitionByExample {

    public void partitioningMap_1(){
        Predicate<Student>gpaPredicate = student ->  student.getGpa()>=3.8;
        Map<Boolean, List<Student>> studentPartition = StudentDataBase.getAllStudents().stream()
                .collect(partitioningBy(gpaPredicate));
        System.out.println("partitioningMap_1: "  + studentPartition);
    }

    public void partitioningMap_2(){
        Predicate<Student>gpaPredicate = student ->  student.getGpa()>=3.8;
        Map<Boolean, Set<Student>> studentPartition = StudentDataBase.getAllStudents().stream()
                .collect(partitioningBy(gpaPredicate,toSet()));
        System.out.println("partitioningMap_2: "  + studentPartition);
    }

    public void Example(){
       partitioningMap_1();
       partitioningMap_2();

    }
}
