package abst;

/**
 * Created by YoungMan on 2019-02-06.
 * Factory 에서 관련있는 부품들 생성
 */

public interface BikeFactory {

    Body createBody();
    Wheel createWheel();
}
