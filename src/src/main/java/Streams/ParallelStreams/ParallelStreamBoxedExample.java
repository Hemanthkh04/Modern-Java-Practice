package Streams.ParallelStreams;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ParallelStreamBoxedExample {

    public int sequentialSum(List<Integer> integerList){
        long start = System.currentTimeMillis();
        int sum  = integerList
                .stream()
                .reduce(0,(x,y)->x+y);
        long duration = System.currentTimeMillis()-start;
        System.out.println("Duration in Sequential Stream: " + duration);
        return  sum;
    }

    public int parallelSum(List<Integer> integerList){
        long start = System.currentTimeMillis();
        int sum  = integerList
                .parallelStream()
                .reduce(0,(x,y)->x+y); //perform unboxing from Integer to int
        long duration = System.currentTimeMillis()-start;
        System.out.println("Duration in Parallel Stream: " + duration);
        return  sum;
    }

    public void Example(){
        List<Integer>integerList = IntStream.rangeClosed(1,10000)
                .boxed()
                .collect(toList());
        sequentialSum(integerList);
        parallelSum(integerList);
    }
}
