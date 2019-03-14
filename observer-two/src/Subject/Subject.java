package Subject;

import Observer.DeliveryObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YoungMan on 2019-03-15.
 */

public abstract class Subject {

    private List<DeliveryObserver> deliveryObservers = new ArrayList<>();

    //통보 대상 추가
    public void add(DeliveryObserver deliveryObserver) {
        deliveryObservers.add(deliveryObserver);
    }

    //통보 대상 삭제
    public void delete(DeliveryObserver deliveryObserver) {
        deliveryObservers.remove(deliveryObserver);
    }

    //변경시 Update 통보
    public void notifyObservers() {
        for (DeliveryObserver o : deliveryObservers) {
            o.update();
        }
    }
}
