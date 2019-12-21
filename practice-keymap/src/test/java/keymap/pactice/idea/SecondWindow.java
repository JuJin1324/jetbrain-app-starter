package keymap.pactice.idea;

/**
 * Created by Yoo Ju Jin(yjj@hanuritien.com)
 * Created Date : 2019/12/21
 */
public class SecondWindow {
    /* TODO : 원활하게 윈도우 관련 단축키 사용을 위해서 FirstCursor / SecondWindow / pom.xml / .gitignore 다 띄어놓기 */

    public static void main(String[] args) {

        /* 탭으로 이동 */
        String selectNextTab = "ctrl(^) + →";
        String selecPreviousTab = "ctrl(^) + ←";

        /* 탭 닫기 - TODO: 다른 탭으로 옮기고 나서 하세요. 안그러면 현재 탭이 닫힙니다. */
        String editorTabsClose = "cmd(⌘) + F4";

        /* Edit 화면만 나오고 나머지 숨기기 */
        String hideAllToolWindows = "cmd(⌘) + shift + F12";

        /* 스플릿 탭 오른쪽 생성 */
        String splitVertically = "ctrl(^) + alt(⌥) | ]";
        /* 스플릿 탭 모두 없애기 */
        String unSplitAll = "ctrl(^) + alt(⌥) | [";

        /* 포커스 오른쪽 탭으로 이동*/
        String moveFocusRight = "ctrl(^) + alt(⌥) + shift + ]";
        /* 포커스 왼쪽 탭으로 이동*/
        String moveFocusLeft = "ctrl(^) + alt(⌥) + shift + [";

        /*
         * 아래 윈도우 늘리기/줄이기 단축키는 edit 가능한 윈도우에서는 불가능(ex *.java)
         * TODO : cmd(⌘) + 1 로 Project 로 포커스를 옮긴다음에 해보기!
         */
        /* 윈도우 오른쪽으로 줄이기/늘리기 */
        String stretchToRight = "cmd(⌘) + shift + →";
        /* 윈도우 왼쪽으로 줄이기/늘리기 */
        String stretchToLeft = "cmd(⌘) + shift + ←";
    }
}
