package FunctionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryOperatorFI {
    UnaryOperator<String>unaryOperator = (s) -> s.concat("default");
    BinaryOperator<Integer>binaryOperator = (a,b) -> a*b;


    Comparator<Integer>comp = (a,b) -> a.compareTo(b);
    BinaryOperator<Integer>maxBy = BinaryOperator.maxBy(comp);
    BinaryOperator<Integer>minBy = BinaryOperator.minBy(comp);

    public void UnaryOperatorExample(){
        System.out.println(unaryOperator.apply("Java-8"));

        System.out.println(binaryOperator.apply(3,4));

        System.out.println("The result of MaxBy is: " + maxBy.apply(4,5));
        System.out.println("The result of MinBy is: " + minBy.apply(4,5));

    }
}
