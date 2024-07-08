// user of extends Thread class

package Multi_Threading;

class MyThread4 extends Thread {
    MyThread4() {
        super("demothread");
        System.out.println("Demo Thread" + this);
        start();
    }

    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("demo thread" + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("demo thread exit");
    }
}

public class Thread_Class {
    public static void main(String ar[]) {
        new MyThread4();
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("main thread" + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("main thread exit");
    }
}
