package Streams;

import data.Student;
import data.StudentDataBase;

public class StreamsMapFilterReduceExample {

    public int noOfNoteBooks(){
        return StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGradeLevel()>=3))
                .filter((student -> student.getGender().equals("female")))
                .map(Student::getNoteBooks)//Stream<Integer>
               // .reduce(0,(a,b)->a+b);
                .reduce(0,Integer::sum);
    }

    public void  Example(){
        System.out.println("The total number of notebooks:" + noOfNoteBooks());
    }
}
