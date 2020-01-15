package com.diyan;

public class RunnableExample {
    public static void main(String[] args) {
        Thread diyanThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from inside Runnable");
            }
        });
        diyanThread.run();

//        Lets do this with LAMBDA :))
        Thread diyanLambdaThread = new Thread(
                () -> System.out.println("Hello From insde Diyan Lambda thread!!")
        );
        diyanLambdaThread.run();
    }
}
