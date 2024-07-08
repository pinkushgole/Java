//multiple thread excute using Runnable interface

package Multi_Threading;

class MyThread1 implements Runnable {
    Thread t;
    String name;

    MyThread1(String st) {
        name = st;
        t = new Thread(this, "name");
        System.out.println(t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(name + " " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(name + " exit");
    }
}

public class Multi_Thread {
    public static void main(String ar[]) {
        MyThread1 m1 = new MyThread1("one");
        MyThread1 m2 = new MyThread1("two");
        MyThread1 m3 = new MyThread1("three");
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
