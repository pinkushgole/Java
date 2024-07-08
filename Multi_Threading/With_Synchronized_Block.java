//  synchronization block

package Multi_Threading;

class Callme {
    void call(String msg) {
        System.out.println("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(msg + "]");
    }
}

class MyThread6 implements Runnable {
    Thread t;
    String msg;
    Callme target;

    public MyThread6(Callme ta, String st) {
        msg = st;
        target = ta;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}

public class With_Synchronized_Block {
    public static void main(String ar[]) {
        Callme target = new Callme();
        MyThread6 m1 = new MyThread6(target, "one");
        MyThread6 m2 = new MyThread6(target, "synchronized");
        MyThread6 m3 = new MyThread6(target, "world");
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
