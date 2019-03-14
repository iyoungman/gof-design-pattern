package Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YoungMan on 2019-03-15.
 * 콘텐츠 추가
 */

public class Magazine extends Subject {
    private List<String> contents = new ArrayList<String>();

    public void addContents(String content) {
        contents.add(content);
        //Subject 의 함수
        notifyObservers();
    }

    public List<String> getContents() {
        return contents;
    }
}
