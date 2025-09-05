package Optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    public String optionalOrElse(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);  //Option.empty()
        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }

    public String optionalOrElseGet(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);  //Option.empty()
        String name = studentOptional.map(Student::getName).orElseGet(() ->"Default");
        return name;
    }

    public String optionalOrElseThrow(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);  //Option.empty()
        String name = studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("No data is Available"));
        return name;
    }

    public void Example(){
        System.out.println("orElse: " + optionalOrElse());
        System.out.println("orElseGet: " +  optionalOrElseGet());
        System.out.println("orElseThrow: " + optionalOrElseThrow());
    }
}
