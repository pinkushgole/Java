// user join keyword keyword in multi threading

package Multi_Threading;

class MyThread4 implements Runnable {
    Thread t;
    String nm;

    MyThread4(String st) {
        nm = st;
        t = new Thread(this, nm);
        System.out.println(t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(nm + " " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(nm + " exit");
    }
}

public class Use_Join {
    public static void main(String ar[]) {
        MyThread1 m1 = new MyThread1("one");
        MyThread1 m2 = new MyThread1("two");
        MyThread1 m3 = new MyThread1("three");
        try {
            m1.t.join();
            m2.t.join();
            m3.t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("main thread exit");
    }
}
