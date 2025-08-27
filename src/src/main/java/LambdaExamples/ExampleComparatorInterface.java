package LambdaExamples;

import java.util.Comparator;

public class ExampleComparatorInterface {
    public void ComparatorLambdaExample(){
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); //0 <- o1 == o1
                                         // 1 <- o1 > o2
                                         // -1 <- o1 < o2
            }
        };
        System.out.println("Result of comparator is: " + comparator.compare(4,3));

        Comparator<Integer>comparator1 = (Integer a,Integer b) -> a.compareTo(b);
        System.out.println("Result of comparator using Lambda is: " + comparator1.compare(4,3));

        Comparator<Integer>comparator2 = (a,b) -> a.compareTo(b);
        System.out.println("Result of comparator using Lambda is: " + comparator2.compare(4,3));
    }
}
