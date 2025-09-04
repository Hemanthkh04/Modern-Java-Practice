package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {

    public Optional<Integer> limit(List<Integer>integerList){
        return integerList.stream()
                .limit(3)
                .reduce((x,y)->x+y);
    }

    public Optional<Integer> skip(List<Integer>integerList){
        return integerList.stream()
                .skip(3)
                .reduce((x,y)->x+y);
    }

    public void Example(){
        List<Integer>integerList = Arrays.asList(6,7,8,9,10);
        Optional<Integer>limitValue = limit(integerList);
        if(limitValue.isPresent()){
            System.out.println("The limit value is: " + limitValue);
        }else{
            System.out.println("The input list is empty.");
        }

        Optional<Integer>skipValue = skip(integerList);
        if(skipValue.isPresent()){
            System.out.println("The limit value is: " + skipValue);
        }else{
            System.out.println("The input list is empty.");
        }


    }
}
