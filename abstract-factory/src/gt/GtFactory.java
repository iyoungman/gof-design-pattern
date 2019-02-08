package gt;

import abst.BikeFactory;
import abst.Body;
import abst.Wheel;

/**
 * Created by YoungMan on 2019-02-06.
 * 삼천리 자전거 공장
 */

public class GtFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
