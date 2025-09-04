package Streams.ParallelStreams;

import java.util.stream.IntStream;

public class SumClient {
    public void Example(){
        Sum sum = new Sum();

        IntStream.rangeClosed(1,1000)
                .parallel()
                .forEach(sum::performSum);

        System.out.println(sum.getTotal());
        //Sequential value -> 500500
        //Parallel value -> 500360 , 500500 , 499104 , 499625
    }
}
