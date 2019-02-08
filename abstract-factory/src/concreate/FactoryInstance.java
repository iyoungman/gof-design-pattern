package concreate;

import abst.BikeFactory;
import gt.GtFactory;
import sam.SamFactory;

/**
 * Created by YoungMan on 2019-02-06.
 */

public class FactoryInstance {

    public static BikeFactory getBikeFactory() {
        String bike = "GT";
        switch (bike) {
            case "GT" :
                return new GtFactory();
            case "SAM" :
                return new SamFactory();
        }
        return null;
    }
}
