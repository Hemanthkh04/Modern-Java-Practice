package MethodReference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReference {

    Consumer<Student> c1 = (student) -> System.out.println(student);

    /**
     * className::methodName
     */
    Consumer<Student>c2 = System.out::println;

    /**
     * className::instanceMethodName
     */
    Consumer<Student>c3 = Student::printListActivties;


    public void ConsumerMethodReferenceExample(){
        StudentDataBase.getAllStudents().forEach(c1);
        System.out.println("-----------------------");
        StudentDataBase.getAllStudents().forEach(c2);
        System.out.println("-----------------------");
        StudentDataBase.getAllStudents().forEach(c3);
    }
}
