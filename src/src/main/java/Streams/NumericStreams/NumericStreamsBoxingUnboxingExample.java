package Streams.NumericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {

    public List<Integer> boxing(){
        return IntStream.rangeClosed(1,10) //instream of 10 elements
                //int
                .boxed()
                //Integer
                .collect(Collectors.toList());
    }

    public int unBoxing(List<Integer>integerList){
        //wrapper to primitive
        return integerList.stream()
                //Wrapper Integer Values
                .mapToInt(Integer::intValue)//intstream(intValue of the Wrapper Class)
                .sum();

    }

    public void Example(){
        System.out.println("Boxing: " + boxing());
        List<Integer>integerList = boxing();
        System.out.println("Unboxing : " + unBoxing(integerList));
    }
}
