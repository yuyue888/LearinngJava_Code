
/**
 * Created by ssc on 2016/12/24.
 */
public class ProducerConsumerPattern {

    public static void main(String[] args){
        Storage storage = new Storage();
        Product product = new Product(storage);
        Consumer consumer = new Consumer(storage);
        Thread thread1 = new Thread(product);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();

    }
}
