package Streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamFilterExample {

    public List<Student> filterStudents(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("male"))
                .filter(student -> student.getGpa()>=3.9)
                .collect(toList());
    }

    public void Example(){
       filterStudents().forEach(System.out::println);
    }
}
