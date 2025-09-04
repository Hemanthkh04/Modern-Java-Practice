package Streams.ParallelStreams;

import java.sql.SQLOutput;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public long checkPerformance(Supplier<Integer>supplier,int noOfTimes){
        long startTime = System.currentTimeMillis();
        for(int i=0;i<noOfTimes;i++){
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static int sumSequentialStream(){
        return IntStream.rangeClosed(1,100000).sum();
    }

    public static int sumParallelStream(){
        return IntStream.rangeClosed(1,100000).parallel().sum();
    }

    public void Example(){
        System.out.println(Runtime.getRuntime().availableProcessors()); // To check how many processors are there in our machine.
        System.out.println("Sequential time result: " + checkPerformance(ParallelStreamExample::sumSequentialStream,20));
        System.out.println("Parallel time result: " + checkPerformance(ParallelStreamExample::sumParallelStream,20));

    }
}
