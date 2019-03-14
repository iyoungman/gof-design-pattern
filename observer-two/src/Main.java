import Observer.CarDelivery;
import Observer.MotorcycleDelivery;
import Subject.Magazine;

/**
 * Created by YoungMan on 2019-03-15.
 */

public class Main {

    public static void main(String[] args) {

        Magazine magazine = new Magazine();

        //차로배달
        CarDelivery carDelivery = new CarDelivery(magazine);
        //오토바이로 배달
        MotorcycleDelivery motorcycleDelivery = new MotorcycleDelivery(magazine);

        // 각 통보 대상 클래스를 Observer로 추가
        magazine.add(carDelivery);
        magazine.add(motorcycleDelivery);

        //잡지 콘텐츠 추가
        for (int i = 0; i <= 3; i++) {
            magazine.addContents("Content" + String.valueOf(i));
        }
    }
}
