import abst.BikeFactory;
import abst.Body;
import abst.Wheel;
import concreate.FactoryInstance;

/**
 * Created by YoungMan on 2019-02-06.
 * 추상화 팩토리 패턴
 */

public class Main {

    public static void main(String[] args) {
//        BikeFactory factory = new GtFactory();

        /*
         * 삼천리면 삼천리Factory, Gt면 GtFactory 넘겨준다.
         * 어떠한 환경이든 동일하게 동작하기 위함
         * 위의 코드처럼 하면 문제의 요지가 있다.
         * 예를 들어 new GtFactory() 를 생성했는데 Sam 을 사용해야만 했을 때
         */
        BikeFactory factory = FactoryInstance.getBikeFactory();

        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();

        body.bodyWork();
        wheel.recoil();
    }
}
