package Streams;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {



    public void Example1(){
        List<Integer>arrayList = Arrays.asList(1, 3, 5, 7);
        List<Integer>integerList = new ArrayList<>();
        System.out.println(performMultiplication(arrayList));
        Optional<Integer> res = performMultiplicationWithoutIdentity(arrayList);
        System.out.println(res.isPresent());
        System.out.println(res.get());
        Optional<Integer> res1 = performMultiplicationWithoutIdentity(integerList);
        if(res1.isPresent())
            System.out.println(res1.get());
        else
            System.out.println(res1.isPresent());

        Optional<Student>highestGpaStudent = getHighestGpaStudent();
        if(highestGpaStudent.isPresent())
            System.out.println("The Highest GPA Student is: " + highestGpaStudent.get());
    }

    public Optional<Integer> performMultiplicationWithoutIdentity(List<Integer>integerList){
        return integerList.stream()
                .reduce((a,b)->a*b);
    }

    private int performMultiplication(List<Integer> arrayList) {
        return arrayList.stream()
                //1
                //3
                //5
                //7
                //a=1,b=1(from stream) => result 1 is returned
                //a=1,b=3(from stream) => result 3 is returned
                //a=3,b=5(from stream) => result 15 is returned
                //a=15,b=7(from stream) => result 105 is returned
                .reduce(1,(a,b)->a*b);
    }

    public Optional<Student> getHighestGpaStudent(){
        return StudentDataBase.getAllStudents().stream()
                //compare student one by one
                .reduce( (s1,s2)-> (s1.getGpa()>s2.getGpa())?s1:s2 );
    }
}
