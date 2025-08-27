package LambdaExamples;

public class ExampleRunnableInterface {
    public void RunnableLambdaExample(){
        /**
         * Prior Java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        //java-8 Lambda () -> {};

        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable 2");
        };

        new Thread(runnableLambda).start();

        Runnable runnableLambda1 = () -> System.out.println("Inside Runnbale 3");
        new Thread(runnableLambda1).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 4");
            }
        }).start();

        new Thread(() -> System.out.println("Inside Runnable 5")).start();

        new Thread(() -> {
            System.out.println("Inside Runnable 6");
            System.out.println("Inside Runnable 6");
        }).start();
    }
}
