package sam;

import abst.BikeFactory;
import abst.Body;
import abst.Wheel;

/**
 * Created by YoungMan on 2019-02-06.
 * 삼천리 자전거 공장
 */

public class SamFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
