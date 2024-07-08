//without synchronization 

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

class MyThread5 implements Runnable {
    Thread t;
    String msg;
    Callme target;

    public MyThread5(Callme ta, String st) {
        msg = st;
        target = ta;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        target.call(msg);
    }
}

public class Without_Synchronization {
    public static void main(String ar[]) {
        Callme target = new Callme();
        MyThread5 m1 = new MyThread5(target, "one");
        MyThread5 m2 = new MyThread5(target, "synchronized");
        MyThread5 m3 = new MyThread5(target, "world");
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
