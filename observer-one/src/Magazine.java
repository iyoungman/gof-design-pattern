import java.util.ArrayList;
import java.util.List;

/**
 * Created by YoungMan on 2019-03-14.
 * 잡지 발행 - 주체객체
 * 잡지는 콘텐츠를 추가
 */

public class Magazine {
    private List<String> contents = new ArrayList<String>();
    private CarDelivery carDelivery;

    public void setCarDelivery(CarDelivery carDelivery) {
        this.carDelivery = carDelivery;
    }

    public List<String> getContents() {
        return contents;
    }

    public void addContents(String content) {
        contents.add(content);
        carDelivery.update();
    }
}
