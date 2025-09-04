package Streams.NumericStreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsRangesExample {
    public void Example(){
        IntStream intStream = IntStream.range(1,50);
        System.out.println("Range count:" + intStream.count());
        IntStream.range(1,50).forEach(value -> System.out.print(value+","));
        System.out.println();

        System.out.println("Range Closed count:" + IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value+","));
        System.out.println();

        System.out.println("Long Stream Range Closed count:" + LongStream.rangeClosed(1,50).count());
        LongStream.rangeClosed(1,50).forEach(value -> System.out.print(value+","));
        System.out.println();


        IntStream.rangeClosed(1,50).asDoubleStream().forEach(value -> System.out.print(value+","));



    }
}
