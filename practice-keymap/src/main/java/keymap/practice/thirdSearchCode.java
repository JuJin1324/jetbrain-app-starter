package keymap.practice;

import keymap.practice.methodHierarchy.ChildClass;

/**
 * Created by Yoo Ju Jin(yjj@hanuritien.com)
 * Created Date : 2019/12/25
 */
public class thirdSearchCode {

    public static void main(String[] args) {

        /* 마지막 Edit 하던거로 돌아가기 */
        String lastEditLocation = "cmd(⌘) + shift + delete" + "여기" + "를 지우고 다른 클래스로 이동 후에 해당 커맨드를 입력해보세요!";

        /* 최근 수정한 파일 목록 */
        String recentFiles = "cmd(⌘) + E";
        /* 최근 수정한 위치 목록 */
        String recentLocations = "cmd(⌘) + shift + E";

        /* 선언부 혹은 사용부 이동 - TODO: parentMethod에 커서를 두고 cmd + B 하면 선언부로 이동, 선언부에서 한번 더 cmd + B 누르면 사용부로 돌아옴 */
        String declarationOrUsages = "cmd(⌘) + B";

        /* 구현부 이동 - TODO: parentMethod에 커서를 두고 단축키 눌러보자 */
        String implementation ="cmd(⌘) + alt(⌥) + B";

        ChildClass childClass = new ChildClass();
        childClass.parentMethod();

        /* 메서드 계층보기 : 커서를 parentMethod 에 두고 단축키 입력 */
        String methodHierarchy = "cmd(⌘) + shift + H";

        /* 사용부 찾기 - TODO : parentMethod에 커서를 두고 cmd + B 를 눌러서 내부로 들어간 이후에 아래 단축키 입력한다. */
        String findUsages = "alt(⌥) + F7";

        /* Find */
        String find = "cmd(⌘) + F";

        /* Find and Replace*/
        String findAndReplace = "cmd(⌘) + R";

        /* Find in path */
        String findInPath = "cmd(⌘) + shift + F" + "OR" + "ctrl(^) + shift + F";

        /* Find in All */
        String findInAll = "shift + shift";

        /* 이전 작업으로 이동 */
        String back = "cmd(⌘) + alt(⌥) + ←";

        /* 기존 작업으로 이동 */
        String forward = "cmd(⌘) + alt(⌥) + →";
    }
}
