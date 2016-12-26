import java.util.ArrayList;
import java.util.List;


/**
 * Created by ssc on 2016/12/25.
 */
public class Storage {
    private List<Object> list = new ArrayList<>();

    private final int MAX_ITEMS = 20;

    /**
     * 生产
     */
    public synchronized void produce(Object object){

            while(list.size()==MAX_ITEMS){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            list.add(object);
            notify();

    }

    /**
     * 消费
     */
    public synchronized void consume(){

            while(list.size() == 0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.remove(list.size()-1);
            notify();
        }

}
