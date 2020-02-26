class Foo {
    public volatile int mark=1;
    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        mark=2;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while(mark!=2);
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        mark=3;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while(mark!=3);
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}