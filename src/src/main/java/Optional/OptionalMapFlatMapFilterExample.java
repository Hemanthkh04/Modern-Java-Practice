package Optional;

import data.Bike;
import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapFilterExample {

    public void optionalFilter(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get()); //Optional<Student>

        studentOptional.filter(student -> student.getGpa()>=3.5)
                .ifPresent(student -> System.out.println(student));
    }

    public void optionalMap(){
        Optional<Student>studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get()); //Optional<Student>

        if(studentOptional.isPresent()){
            Optional<String> stringOptional = studentOptional
            .filter(student -> student.getGpa()>=3.5)
                    .map(Student::getName);
            System.out.println(stringOptional.get());
        }
    }

    public  void optionalFlatMap(){
        Optional<Student>optionalStudent =
                Optional.ofNullable(StudentDataBase.studentSupplier.get()); //Optional<Student>

        Optional<String>name = optionalStudent
                .filter(student -> student.getGpa()>=3.5) //Optional<Student Optional<Bike>>
                .flatMap(Student::getBike) //returns -> Optional<Bike>
                .map(Bike::getName);

        name.ifPresent(s -> System.out.println("name: " + name));
    }


    public void Example(){
          optionalFilter();
          optionalMap();
          optionalFlatMap();
    }
}
