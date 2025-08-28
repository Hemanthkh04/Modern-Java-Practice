package MethodReference;

import java.util.function.Function;

public class FunctionMethodReference {

    Function<String,String>toLambdaExpression = (s) -> s.toUpperCase();
    Function<String,String>toLambdaExpression1 = String::toUpperCase;

    public void FunctionMethodReferenceExample(){
        System.out.println(toLambdaExpression.apply("java"));
        System.out.println(toLambdaExpression1.apply("java"));
    }
}
