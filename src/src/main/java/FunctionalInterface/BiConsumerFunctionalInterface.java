package FunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerFunctionalInterface {

    public void namesAndActivities(){
        BiConsumer<String, List<String>>biConsumer = (name,activities) -> System.out.println(name + ":" + activities);
        List<Student>studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));
    }

    public void biConsumerExample(){
        BiConsumer<String,String>biConsumer = (a,b) -> {
            System.out.println("a : " +  a + " b " + b);
        };

        biConsumer.accept("java7","java8");

        BiConsumer<Integer,Integer>multiply = (a,b) -> {
            System.out.println("Multiplication is: " + a*b);
        } ;

        BiConsumer<Integer,Integer>divison = (a,b) -> {
            System.out.println("Division is: " + a/b);
        } ;

        multiply.andThen(divison).accept(10,5);

        namesAndActivities();

    }
}
