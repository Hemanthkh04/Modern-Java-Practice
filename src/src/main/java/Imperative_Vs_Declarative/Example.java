package Imperative_Vs_Declarative;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Example {
    public void ImperativeDeclarativeExample() {
        //Example-1
        /**
         * Imperative Style
         */

        int sum = 0;
        for(int i=0;i<=100;i++){
            sum += i;
        }
        System.out.println("Sum using Imperative approach: " + sum);

        /**
         * Declarative Style
         */
        int sum1 = IntStream.rangeClosed(0,100)
                .sum();
        System.out.println("Sum using Declarative approach: " + sum1);

        //Example-2
        List<Integer> integerList = Arrays.asList(1,2,3,3,4,5,5,6,7,8,8,9,10);
        /**
         * Imperative Style
         */

        List<Integer> uniqueList = new ArrayList<>();

        for(Integer integer: integerList){
            if(!uniqueList.contains(integer)){
                uniqueList.add(integer);
            }
        }
        System.out.println("uniqueList: " + uniqueList);

        /**
         * Declarative Style
         */

        List<Integer>uniqueList1 = integerList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("uniqueList1: " + uniqueList1);
    }
}
