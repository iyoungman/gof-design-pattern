/**
 * Created by YoungMan on 2019-02-09.
 */

public class SystemSpeaker {

    /*
     * static : 메모리에 바로올림
     * static 은 공유(하나만 생성하겠다)
     */
    private static SystemSpeaker instance;
    private int volume;

    /*
     * private 인 이유는 다른곳에서 생성할 수 없도록
     * 이 클래스 안에서만 객체 생성
     */
    private SystemSpeaker() {
        //기본값
        volume = 5;
    }

    public static SystemSpeaker getInstance() {
        if (instance == null) {//처음 한번만 생성
            //시스템 스피커
            instance = new SystemSpeaker();
            System.out.println("새로 생성");
        } else {
            System.out.println("이미 생성");
        }

        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
