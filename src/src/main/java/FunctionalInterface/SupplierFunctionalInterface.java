package FunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {
    Supplier<Student>student = ()-> new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));

    Supplier<List<Student>>listStudent = () -> StudentDataBase.getAllStudents();

    public void SupplierExample(){
        System.out.println(student.get());
        System.out.println(listStudent.get());
    }
}
