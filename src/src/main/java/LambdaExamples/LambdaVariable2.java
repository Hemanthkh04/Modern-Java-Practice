package LambdaExamples;

import java.util.function.Consumer;

public class LambdaVariable2 {
    int value = 4;
    public void LambdaVariableExample2(){
        int val = 4;

        Consumer<Integer>c1 = (i) -> {
            value++; //No restriction on Instance Variable
            //val++ => Cannot Modify the Local Variable(Second Restriction - Local Variables)
            //val = 6 => Not Possible ( Concept is Effectively Final)
            System.out.println("The value is: " + (val + i));
            System.out.println("Value: " + value);
        };
        c1.accept(4);
    }
}
