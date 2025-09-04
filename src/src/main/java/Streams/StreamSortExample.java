package Streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamSortExample {

    public List<Student> sortStudentByName(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
    }

    public List<Student> sortStudentByGpa(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());
    }

    public List<Student> sortStudentByGpaDesc(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());
    }

    public void Example(){
        System.out.println("Student Sorted by Name");
        sortStudentByName().forEach(System.out::println);
        System.out.println("Student sorted by GPA");
        sortStudentByGpa().forEach(System.out::println);
        System.out.println("Student sorted by GPA Decreasing order");
        sortStudentByGpaDesc().forEach(System.out::println);
    }
}
