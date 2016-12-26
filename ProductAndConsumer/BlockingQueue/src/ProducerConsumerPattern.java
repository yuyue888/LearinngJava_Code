import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by ssc on 2016/12/24.
 */
public class ProducerConsumerPattern {

    public static void main(String[] args){
        BlockingQueue blockingQueue = new LinkedBlockingDeque();
        Thread proThread = new Thread(new Product(blockingQueue));
        Thread conThread = new Thread(new Consumer(blockingQueue));
        proThread.start();
        conThread.start();
    }
}
