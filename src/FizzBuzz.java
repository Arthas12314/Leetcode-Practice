import java.util.Hashtable;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

class FizzBuzz {
    private int n;
    private int i=1;
    Lock lock;

    public FizzBuzz(int n) {
        this.n = n;
        lock=new ReentrantLock();
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while(n%3!=0);
        printFizz.run();
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while(n%5!=0);
        printBuzz.run();
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while(n%5!=0 || n%3!=0);
        printFizzBuzz.run();

    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while(i%3!=0 || i%5!=0);
        printNumber.accept(i);
        lock.lock();
        i++;
        lock.unlock();
    }
}