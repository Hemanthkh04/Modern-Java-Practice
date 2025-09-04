package Streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamMapExample {

    public List<String> namesList(){
        List<String>studentNames = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(toList());
        return studentNames;
    }

    public Set<String> namesSet(){
        Set<String>studentNames = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(toSet());
        return studentNames;
    }

    public void Example(){
        System.out.println(namesList());
        System.out.println(namesSet());
    }
}
