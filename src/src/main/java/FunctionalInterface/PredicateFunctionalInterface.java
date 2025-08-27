package FunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {

    Predicate<Integer>p = (i) -> { return i%2 == 0; };
    Predicate<Integer>p1 = (i) -> i%2 == 0;
    Predicate<Integer>p2 = (i) -> i%5 == 0;

    Predicate<Student>p3 = (student) ->  student.getGradeLevel() >=3;
    Predicate<Student>p4 = (student) -> student.getGpa()>=3.9;

    public void filterStudentsByGradeLevel(){
        System.out.println("The Students whose Grades are greater than 3: ");
        List<Student>studentList =  StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(p3.test(student))
                System.out.println(student);
        }));
    }

    public void filterStudentsByGpa(){
        System.out.println("The Students whose GPA are greater than 3: ");
        List<Student>studentList =  StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(p4.test(student))
               System.out.println(student);
        }));
    }

    public void filterStudents(){
        System.out.println(" To Filter Students ");
        List<Student>studentList =  StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(p3.and(p4).negate().test(student))
                System.out.println(student);
            else
                System.out.println(student);
        }));
    }

    public void predicateAnd(){
        System.out.println("The Predicate And result is: " + p1.and(p2).test(10));
        System.out.println("The Predicate And result is: " + p1.and(p2).test(8));
    }

    public void predicateOr(){
        System.out.println("The Predicate Or result is: " + p1.or(p2).test(10));
        System.out.println("The Predicate Or result is: " + p1.or(p2).test(8));
    }

    public void predicateNegate(){
        System.out.println("The Predicate Negate result is: " + p1.or(p2).negate().test(8));
    }

    public void PredicateExample(){
        System.out.println("The Predicate  result is: " + p1.test(4));
        System.out.println("The Predicate  result is: " + p1.test(5));

        predicateAnd();
        System.out.println("--------------------------------------------");
        predicateOr();
        System.out.println("---------------------------------------------");
        predicateNegate();

        System.out.println("============================================");

        filterStudentsByGradeLevel();
        System.out.println("---------------------------------------------");
        filterStudentsByGpa();
        System.out.println("---------------------------------------------");
        filterStudents();

    }
}
