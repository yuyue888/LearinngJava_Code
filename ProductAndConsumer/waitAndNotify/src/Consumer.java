import static java.lang.Thread.sleep;

/**
 * Created by ssc on 2016/12/24.
 */
public class Consumer  implements Runnable{

    private Storage storage;

    public Consumer(Storage storage){
        this.storage = storage;
    }

    @Override
    public void run() {
        for(int i = 0;i<40;i++){
            storage.consume();
            System.out.println("消费："+ i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
