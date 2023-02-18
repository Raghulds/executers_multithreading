import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService executors = Executors.newFixedThreadPool(10);
        for(int i=0;i<100;i++) {
            logger log = new logger(i);
            executors.execute(log);
        }
        executors.shutdown();
    }
}