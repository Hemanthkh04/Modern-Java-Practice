package Streams.Streams_TerminalOperations;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamsMappingExample {
    public void Example(){
        List<String> studentNamesList = StudentDataBase.getAllStudents().stream().
                collect(mapping(Student::getName,toList()));

        System.out.println("Student Names List : " + studentNamesList);

        Set<String> studentNamesSet = StudentDataBase.getAllStudents().stream().
                collect(mapping(Student::getName,toSet()));

        System.out.println("Student Names Set: " + studentNamesSet);

    }
}
