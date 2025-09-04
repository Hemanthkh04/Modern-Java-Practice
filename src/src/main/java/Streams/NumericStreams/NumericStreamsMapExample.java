package Streams.NumericStreams;

import java.util.stream.IntStream;

public class NumericStreamsMapExample {

    /*public List<Integer> mapToObj(){
        return IntStream.rangeClosed(1,5)
                .mapToObj(Integer::new)
                .collect(Collectors.toList());
    }*/

    public  long mapToLong(){
        return IntStream.rangeClosed(1,5) //instream
                //i is passed from the instream
                .mapToLong((i)->i) //convert intstream to longstream
                .sum();
    }

    public  double mapToDouble(){
        return IntStream.rangeClosed(1,5) //instream
                //i is passed from the instream
                .mapToDouble((i)->i) //convert intstream to doublestream
                .sum();
    }


    public void Example(){
        /*System.out.println("mapToObj: " mapToObj());*/
        System.out.println("mapToLong : " + mapToLong());
        System.out.println("mapToDouble : " + mapToDouble());
    }
}
