package Streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamsFlatmapExample {

    public List<String> printStudentActivites(){
        List<String>studentActivities =  StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream)//Stream<String>
                .distinct()
                .sorted()
                .collect(toList());
        return studentActivities;
    }

    public Long geStudentActivitesCount(){
        long studentActivitiesCount =  StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream)//Stream<String>
                .distinct()
                .count();
        return studentActivitiesCount;
    }

    public Set<String> printStudentActivites1(){
        Set<String>studentActivities =  StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream)//Stream<String>
                .collect(toSet());
        return studentActivities;
    }


    public void Example(){
        System.out.println("The Student Activities are: " + printStudentActivites());
        System.out.println("The count of Student Activites: " + geStudentActivitesCount());
        System.out.println("The Unique Student Activities are: " + printStudentActivites1());
    }
}
