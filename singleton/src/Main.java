/**
 * Created by YoungMan on 2019-02-09.
 */

public class Main {

    public static void main(String[] args) {
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();

        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        speaker1.setVolume(6);

        //speaker1만 바꿨지만 speaker1과 speaker2가 같다
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());
    }

}
