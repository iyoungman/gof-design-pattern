package helper;

/**
 * Created by YoungMan on 2019-02-11.
 * 변경된 부분은 이곳에서 수정
 */

public class DefaultGameConnectionHelper extends AbstGameConnectHelper {

    @Override
    protected String doSecurity(String info) {
        System.out.println("DefaultGameConnectionHelper doSecurity" + info);
        return info;
    }

    @Override
    protected String authentication(String id, String password) {
        System.out.println("DefaultGameConnectionHelper authentication");

        if(id.equals("abc")|password.equals("abc"))
            return "true info";
        else
            return "false info";
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("DefaultGameConnectionHelper authorization");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("DefaultGameConnectionHelper connection");
        return "DefaultGameConnectionHelper" + info;
    }
}
