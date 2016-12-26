import static java.lang.Thread.sleep;

/**
 * Created by ssc on 2016/12/24.
 */
public class Product implements Runnable{
    private Storage storage;

    public Product(Storage storage){
        this.storage = storage;
    }

    @Override
    public void run() {
        for(int i =0;i<40;i++){
            storage.produce(i);
            System.out.println("生产："+ i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
