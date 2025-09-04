package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public int findMaxValueOfList(List<Integer>integerList){
            return integerList.stream()
                    .reduce(0,(x,y)->x>y?x:y);
    }

    public Optional<Integer> findMaxValueOfListOptional(List<Integer>integerList){
        return integerList.stream()
                .reduce((x,y)->x>y?x:y);
    }

    public Optional<Integer> findMinValue(List<Integer>integerList){
        return integerList.stream()
                .reduce((x,y)->x<y?x:y);
    }

    public void Example(){
        List<Integer>integerList = Arrays.asList(6,7,8,9,10);
       // List<Integer>integerList = new ArrayList<>();
        int maxValue = findMaxValueOfList(integerList);
        System.out.println("Max Value is: "+ maxValue);

        Optional<Integer>maxValueOptional = findMaxValueOfListOptional(integerList);
        System.out.println("Optional Max is: " + maxValueOptional);
        if(maxValueOptional.isPresent()){
            System.out.println("Max Value using Optional: " + maxValueOptional);
        }else{
            System.out.println("Input List is empty.");
        }

        Optional<Integer>minValueOptional = findMinValue(integerList);
        System.out.println("Optional Min is: " + minValueOptional);
        if(minValueOptional.isPresent()){
            System.out.println("Min Value using Optional: " + minValueOptional);
        }else{
            System.out.println("Input List is empty.");
        }
    }
}
