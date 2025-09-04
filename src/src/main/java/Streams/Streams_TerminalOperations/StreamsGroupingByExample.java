package Streams.Streams_TerminalOperations;

import data.Student;
import data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamsGroupingByExample {

    public void groupingByGender(){
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(studentMap);
    }

    public void customizedKeyGroupingBy(){
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(student -> student.getGpa()>=3.8 ? "Outstanding" : "Average"));
        System.out.println(studentMap);
    }

    public void twoLevel_GroupingBy1(){
        Map<Integer,Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(student -> student.getGpa()>=3.8 ? "Outstanding" : "Average")));
        System.out.println(studentMap);
    }

    public void twoLevel_GroupingBy2(){
        Map<String,Integer> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName,
                        summingInt(Student::getNoteBooks)));
        System.out.println(studentMap);
    }

    public void threeArgumentGroupBy(){
        LinkedHashMap<String, Set<Student>>studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new,toSet()));
        System.out.println(studentMap);
    }

    public void calculateTopGpa(){
        Map<Integer,Student>studentOptional = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));
        System.out.println(studentOptional);
    }

    public void calculateLeastGpa(){
        Map<Integer,Student>studentOptional = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,collectingAndThen(minBy(Comparator.comparing(Student::getGpa)),Optional::get)));
        System.out.println(studentOptional);
    }



    public void Example(){
        //groupingByGender();
        //customizedKeyGroupingBy();
        //twoLevel_GroupingBy1();
        //twoLevel_GroupingBy2();
        //threeArgumentGroupBy();
        //calculateTopGpa();
        calculateLeastGpa();
    }
}
