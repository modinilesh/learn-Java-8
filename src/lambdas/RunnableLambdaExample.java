package lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        /**
         * Before introducing java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable 1");
            }
        };

        new Thread(runnable).start();

        /**
         * using Java 8 Lambdas
         */
        //way1
        Runnable runnableLambda = () -> {
            System.out.println("Inside runnableLambda 1");
        };
        new Thread(runnableLambda).start();

        //way2
        Runnable runnableLambda2 = () -> System.out.println("Inside runnableLambda 2");
        new Thread(runnableLambda2).start();

        //way3
        new Thread(() -> System.out.println("Inside runnableLambda 3")).start();



    }



}
