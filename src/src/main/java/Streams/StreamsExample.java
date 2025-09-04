package Streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {
    public void Example1(){

        Predicate<Student>studentGradeLevel = (student -> student.getGradeLevel()>=3);
        Predicate<Student>studentGrade = (student -> student.getGpa()>=3.9);

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .peek(student -> {
                    System.out.println(student);
                })
                .filter(studentGradeLevel)
                .peek(student -> {
                    System.out.println("After 1st Filter: " + student);
                })
                .filter(studentGrade)
                .peek(student -> {
                    System.out.println("After 2nd Filter: " + student);
                })
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        //System.out.println(studentMap);
    }
}
