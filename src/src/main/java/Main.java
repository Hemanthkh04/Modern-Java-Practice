import Imperative_Vs_Declarative.Example;
import LambdaExamples.ExampleComparatorInterface;
import LambdaExamples.ExampleRunnableInterface;

public class Main {
    public static void main(String args[]){
        /*Example e = new Example();
        e.ImperativeDeclarativeExample();*/
        ExampleRunnableInterface exampleRunnableInterface = new ExampleRunnableInterface();
        exampleRunnableInterface.RunnableLambdaExample();

        ExampleComparatorInterface exampleComparatorInterface = new ExampleComparatorInterface();
        exampleComparatorInterface.ComparatorLambdaExample();
    }
}
