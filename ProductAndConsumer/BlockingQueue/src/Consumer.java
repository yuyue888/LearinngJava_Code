import java.util.concurrent.BlockingQueue;

/**
 * Created by ssc on 2016/12/24.
 */
public class Consumer  implements Runnable{
    private final BlockingQueue blockingQueue;

    public Consumer(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for(int i=0 ;i<10;i++){
            try {
                System.out.println("Consumer :" + i);
                blockingQueue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
