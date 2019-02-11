import helper.AbstGameConnectHelper;
import helper.DefaultGameConnectionHelper;

/**
 * Created by YoungMan on 2019-02-11.
 */

public class Main {

    public static void main(String[] args) {
        //이와 같은 형태는 오버라이딩 된것만 자식것을 이용한다.
        AbstGameConnectHelper abstGameConnectHelper = new DefaultGameConnectionHelper();

        //요구사항이 변경되어도 Main 이나 AbstGameConnectHelper 에서는 변경될 부분은 없다.
        abstGameConnectHelper.requestConnection("info");
    }
}
