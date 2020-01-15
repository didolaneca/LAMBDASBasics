package com.diyan;

public class Greeter {
    private void greet(Greeting greeting){
        //System.out.println("Hello Diyan!");
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);
//        We are passing a Greeintg Object that has the perform method.
//        Can we pass the just the action instead of a Class that has the method?
//        With LABDAS we can.
//        public void freet(action){
//            action();
//        }
//        LAMBDAS lets you create this entities which are just functions, those function can be treated as values
//        and can be passed on.
//        Those are values
        String diyan = "Diyam";
        double pi = 3.14;
//        Can we do something like that?
//        diyan = {
//                block of code
//        }
//        We can do that with moethods
//        Can we assign the method to a variable?
//        diyanBlockOfCode = public void perform(){
//            System.out.println("Hello World!");
//        }
//        diyanBlockOfCode = () -> System.out.println("Hello World!");
//        What is the type of the variable diyanBlockOfCode variable? Go to line 44
        //        We can pass it to a method
        //        greeter(diyanBlockOfCode)
        //        or  we can
        //        greeter(greeter.greet(helloWorldGreeting))
        //        doubleNumberFunction = public int double(int a) {
        //            return a * 2;
        //        }
        //        this can be re written in the following form as lambda
        //        doubleNumberFunction = (int a) -> a * 2;
//        To declare a type we have to first write our own interface
//        with one method in the interface that resembles the signature of the lambda!
        DiyanLambda diyanBlockOfCode = () -> System.out.println("Hello World!");
//        We can use the greeing interface we wrote earlier instead of writing a new one.
        DiyanAddLambda addLambda = (int a, int b) -> a + b;
//        go to the interface  and add ano more method.
//        Hint: it will give us error
//        How do you execute a LAMBDA expresion?
//                Answer???
//        What is the difference between the two expressions bellow?
        Greeting diyanBlockOfCode2 = () -> System.out.println("Hello World from LAMBDA2!");
        Greeting innerClassGreeting = new Greeting(){
            @Override
            public void perform() {
                System.out.println("Hello World from inner class!");
            }
        };
//        innerClassGreeting.perform();
        greeter.greet(diyanBlockOfCode2);
        greeter.greet(innerClassGreeting);




    }
}


interface DiyanLambda{
    void anyNameYouWant();
}

interface DiyanAddLambda {
    int anynamewilldo(int x, int y);
}