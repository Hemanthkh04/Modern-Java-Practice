package MethodReference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReference {

    Predicate<Student>p1 = (student) -> student.getGradeLevel()>=3;

    Predicate<Student>p2 = RefactorMethodReference::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student student){
        return student.getGradeLevel()>=3;
    }

    public void RefactorMethodReferenceExample(){
        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
        System.out.println("--------------------------------------------");
        System.out.println(p2.test(StudentDataBase.studentSupplier.get()));
    }
}
