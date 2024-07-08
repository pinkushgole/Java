// basic of multi threading

package Multi_Threading;

public class MultiThreading {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        System.out.println(t);
        System.out.println(t.getName());
        t.setName("thread");
        System.out.println(t.getName());
        System.out.println(t);
        System.out.println(t.getPriority());
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t.getPriority());
        System.out.println(t);
        System.out.println(t.isAlive());
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread" + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("End");
    }
}
