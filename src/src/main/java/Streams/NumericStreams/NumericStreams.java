package Streams.NumericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreams {

    public int sumOfNNumbers(List<Integer>integerList){
        return integerList.stream() //unboxing to convert the Integer to int
                .reduce(0,(x,y)->x+y);
    }

    public int sumOfNumbersUsingNStreams(){
        return IntStream.rangeClosed(1,6)
                .sum();
    }

    public void Example(){
        List<Integer>integerList = Arrays.asList(1,2,3,4,5,6);
        System.out.println("The sum of N numbers: " + sumOfNNumbers(integerList));
        System.out.println("The sum of N numbers using Numeric Streams: " + sumOfNumbersUsingNStreams());
    }
}
