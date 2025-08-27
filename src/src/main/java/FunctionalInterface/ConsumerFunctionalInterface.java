package FunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterface {

    Consumer<Student>c2 = (student) -> System.out.println(student);
    Consumer<Student>c3 = (student) -> System.out.print(student.getName());
    Consumer<Student>c4 = (student) -> System.out.println(student.getActivities());

    public void printStudents(){
        List<Student>studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }

    public void printNameAndActivites(){
        System.out.println("------printNameAndActivites-------");
        List<Student>studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c3.andThen(c4));
    }

    public void printNameAndActivitesUsingCondition(){
        System.out.println("------printNameAndActivitesUsingCondition-------");
        List<Student>studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(student.getGradeLevel()>=3){
                c3.andThen(c4).accept(student); //Consumer Chaining
            }
        }));
    }

    public void ConsumerExample(){
        Consumer<String>c = (s) -> System.out.println(s.toUpperCase());
        c.accept("java8");
        printStudents();
        printNameAndActivites();
        printNameAndActivitesUsingCondition();
    }
}
