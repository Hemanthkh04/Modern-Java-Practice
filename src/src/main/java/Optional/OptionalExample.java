package Optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public String getStudentName(){
        //Student student = StudentDataBase.studentSupplier.get();
        Student student = null;
        if(student!=null){
            return student.getName();
        }
        return null;
    }

    public Optional<String> getStudentNameOptional(){
        //Optional<Student>studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student>studentOptional = Optional.ofNullable(null); //Optional.empty()

        if(studentOptional.isPresent()){
            studentOptional.get();
            return studentOptional.map(Student::getName); //Optional<String>
        }
        return Optional.empty(); //Reperesents an optional object with no value
    }

    public void Example(){
//       String name = getStudentName();
//       if(name!=null)
//           System.out.println("Length of the student Name: " + name.length());
//       else
//           System.out.println("Name not found");

        Optional<String> stringOptional = getStudentNameOptional();
        if(stringOptional.isPresent()){
            System.out.println("Length of the student Name : " + stringOptional.get().length());
        }else{
            System.out.println("Name not found");
        }
    }
}
