package Synchronized;

import java.util.Arrays;
import java.util.List;

public class AccountingSync implements Runnable {
    @Override
    public void run() {
        for(int j=0;j<100;j++){
            increase();
        }
    }

    static int i=0;

    /**
     * synchronized 修饰实例方法
     */
    public synchronized void increase(){
        i = i + 1;
    }

    public static void main(String[] args) throws InterruptedException {
        AccountingSync instance=new AccountingSync();
        Thread t1=new Thread(instance);
        //Thread t2=new Thread(instance);
        t1.start();
        //t2.start();
        t1.join();
        //t2.join();
        System.out.println(i);

        new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();

        //System.out.print((int even, int odd) -> even + odd);
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(n -> System.out.println(n));

        //Integer n = ((int even, int odd) -> even + odd);
        //(int a, int b) -> {  return a + b; }


    }

}
