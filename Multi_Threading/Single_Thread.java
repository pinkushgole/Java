// single thread use implements Runnable interface

package Multi_Threading;

class MyThread implements Runnable {
    Thread t;

    MyThread() {
        t = new Thread(this, "single thread");
        System.out.println(t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("my thread" + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("my thread exit");
    }
}

public class Single_Thread {

    public static void main(String ar[]) {
        MyThread m = new MyThread();
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
