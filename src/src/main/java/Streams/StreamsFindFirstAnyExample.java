package Streams;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamsFindFirstAnyExample {

    public Optional<Student> findFirst(){
        return StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGpa()>=3.9))
                .findFirst();
    }

    public Optional<Student> findAny(){
        return StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGpa()>=3.9))
                .findAny();
    }

    public void Example(){
       Optional<Student>studentOptionalFindFirst = findFirst();
       if(studentOptionalFindFirst.isPresent()){
           System.out.println("Found the student: " + studentOptionalFindFirst.get());
       }else{
           System.out.println("Student Not Found");
       }

        Optional<Student>studentOptionalFindAny = findAny();
        if(studentOptionalFindAny.isPresent()){
            System.out.println("Found the student: " + studentOptionalFindAny.get());
        }else{
            System.out.println("Student Not Found");
        }
    }
}
