package MethodReference;

import data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReference {
    Supplier<Student>studentSupplier = Student::new;

    Function<String,Student>studentFunction = Student::new;

    public void ConstructorReferenceExample(){
        System.out.println(studentSupplier.get());
        System.out.println(studentFunction.apply("ABC"));
    }


}
