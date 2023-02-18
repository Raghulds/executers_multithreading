public class logger implements Runnable {

    int num;

    public logger(int num) {
        this.num = num;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " - " + this.num);

    }
}
