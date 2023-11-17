package thread;

/**
 * @author: Feng YuJie
 * @create: 2022/8/5 14:19
 */
public class ThreadTest extends Thread{

    public void run() {
        int n = 0;
        while (! isInterrupted()) {
            n ++;
            System.out.println(n + " hello!");
        }
    }


    public static void main(String[] args) throws InterruptedException {
        ThreadTest t = new ThreadTest();
        t.start();
        Thread.sleep(1000); // 暂停1毫秒
        t.interrupt(); // 中断t线程
        t.join(); // 等待t线程结束
        System.out.println("end");
    }
}
