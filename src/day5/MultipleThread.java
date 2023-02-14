package day5;

import java.util.Arrays;

public class MultipleThread {

    public MultipleThread() {
        MyRunnable runnable1 = new MyRunnable();
        MyRunnable runnable2 = new MyRunnable();
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Arrays.asList(thread1, thread2).parallelStream().forEach(Thread::start);
    }
}
