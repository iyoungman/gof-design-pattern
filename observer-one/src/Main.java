/**
 * Created by YoungMan on {2019-03-14}.
 */

public class Main {

    public static void main(String[] args) {
        Magazine magazine = new Magazine();

        //배달 준비
        CarDelivery carDelivery = new CarDelivery(magazine);
        magazine.setCarDelivery(carDelivery);

        //잡지 콘텐츠 추가
        for (int i = 0; i <= 3; i++) {
            magazine.addContents("Content" + String.valueOf(i));
        }
    }
}
