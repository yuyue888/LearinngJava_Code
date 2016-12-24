import java.util.concurrent.BlockingQueue;
import java.util.logging.Logger;

/**
 * Created by ssc on 2016/12/24.
 */
public class Product implements Runnable{

    private  final BlockingQueue blockingQueue;

    public Product(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for(int i=0 ;i<10 ;i++){
            try {
                System.out.println("Producer :"+i);
                blockingQueue.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Logger.getLogger(Product.class.getName());
            }
        }
    }
}
