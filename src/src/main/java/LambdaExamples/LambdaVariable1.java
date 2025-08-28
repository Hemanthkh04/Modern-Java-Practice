package LambdaExamples;

import java.util.function.Consumer;

public class LambdaVariable1 {

    public void LambdaVariableExample1(){
        int i=0;

        //i -> cannot pass as arguments to lambda expression(First Restriction - Local Variables)
        Consumer<Integer>c1 = (i1) ->{
            System.out.println("Value of i is: " + i);
            System.out.println("Value of i1 is:" + i1);
        };

        c1.accept(5);
    }
}
