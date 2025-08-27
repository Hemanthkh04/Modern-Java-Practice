package FunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionFunctionalInterface {

    Function<String,String>function = (str) -> str.toUpperCase();
    Function<String,String>addSomeString = (str) -> str.concat("default");
    Predicate<Student>p3 = (student) ->  student.getGradeLevel() >=3;

    Function<List<Student>, Map<String,Double>>studentFunction = (students -> {
        Map<String,Double>studentGradeMap = new HashMap<>();
        students.forEach(student -> {
            if(p3.test(student)){
                studentGradeMap.put(student.getName(),student.getGpa());
            }
        });
        return studentGradeMap;
    });

    public void FunctionExample(){
        System.out.println(function.apply("java"));
        System.out.println(function.andThen(addSomeString).apply("java"));
        System.out.println(function.compose(addSomeString).apply("java"));

        System.out.println("========================================");

        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
