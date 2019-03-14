package Observer;

import Subject.Magazine;

import java.util.List;

/**
 * Created by YoungMan on 2019-03-15.
 */

public class CarDelivery implements DeliveryObserver {
    private Magazine magazine;

    public CarDelivery(Magazine magazine) {
        this.magazine = magazine;
    }

    @Override
    public void update() {
        List<String> contents = magazine.getContents();
        delivery(contents);
    }

    private void delivery(List<String> contents) {
        System.out.println("차로 배달");

        for (int i = 0; i < contents.size(); i++) {
            System.out.println(contents.get(i));
        }
    }
}
