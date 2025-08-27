package FunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionFunctionalInterface {

    Predicate<Student>p4 = (student) -> student.getGpa()>=3.9;

    BiFunction<List<Student>, Predicate<Student>, Map<String,Double>>studentBiFunction = ((students,studentPredicate)->{
        Map<String,Double>studentGradeMap = new HashMap<>();
        students.forEach(student -> {
            if(studentPredicate.test(student)){
                studentGradeMap.put(student.getName(),student.getGpa());
            }
        });
        return studentGradeMap;
    });

    public void BiFunctionExample(){
        System.out.println(studentBiFunction.apply(StudentDataBase.getAllStudents(),p4));
    }
}
