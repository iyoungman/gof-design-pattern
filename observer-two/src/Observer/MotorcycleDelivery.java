package Observer;

import Subject.Magazine;

import java.util.List;

/**
 * Created by YoungMan on 2019-03-15.
 */

public class MotorcycleDelivery implements DeliveryObserver {
    private Magazine magazine;

    public MotorcycleDelivery(Magazine magazine) {
        this.magazine = magazine;
    }

    @Override
    public void update() {
        List<String> contents = magazine.getContents();
        delivery(contents);
    }

    private void delivery(List<String> contents) {
        System.out.println("오토바이로 배달");

        for (int i = 0; i < contents.size(); i++) {
            System.out.println(contents.get(i));
        }
    }
}
