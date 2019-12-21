package keymap.pactice.idea;

/**
 * Created by Yoo Ju Jin(yjj@hanuritien.com)
 * Created Date : 2019/12/21
 */
public class FirstCursor {

    public static void main(String[] args) {
        /* 1. 단어 사이로 커서 이동 */
        String moveCaretToNextWord = "alt(⌥)(⌥) + →" + "Start to to to to to End.";
        String moveCaretToPreviousWord = "alt(⌥)(⌥) + ←" + "End from from from from Start.";

        /* 2. 라인 시작 및 끝으로 이동 */
        String moveCaretToLineStart = "cmd(⌘) + ←" + "String is where cursor would be.";
        String moveCaretToLineEnd = "cmd(⌘) + →" + "is where cursor would be.";
    }

    /* 3. 다음 메서드로 이동 */
    public void nextMethod1() {
        System.out.println("alt(⌥) + ↓" + "move to Next Method");
    }

    public void nextMethod2() {
        System.out.println("alt(⌥) + ↓" + "move to Next Method");
    }

    public void nextMethod3() {
        System.out.println("alt(⌥) + ↓" + "move to Next Method");
    }

    /* 4. 이전 메서드로 이동 */
    public void previousMethod1() {
        System.out.println("alt(⌥) + ↑" + "move to Previousious Method");
    }

    public void previousMethod2() {
        System.out.println("alt(⌥) + ↑" + "move to Previousious Method");
    }

    public void previousMethod3() {
        System.out.println("alt(⌥) + ↑" + "move to Previousious Method");
    }

    /* 5. 라인 옮기기 */
    public void moveLine() {
        /* 라인 위치 내리기 */
        String moveLineDown = "shift + alt(⌥) + ↓";
        System.out.println("Move Line Down to this.");
        System.out.println("Move Line Down to this.");
        System.out.println("Move Line Down to this.");
        System.out.println("Move Line Down to this.");
        System.out.println("Move Line Down to this.");

        /* 라인 위치 올리기 */
        System.out.println("Move Line Up to this.");
        System.out.println("Move Line Up to this.");
        System.out.println("Move Line Up to this.");
        System.out.println("Move Line Up to this.");
        System.out.println("Move Line Up to this.");
        String moveLineUp = "shift + alt(⌥) + ↑";

        /* 라인 블록단위 내리기 */
        for (int i = 0; i < 10; i++) {  /* TODO: 커서는 여기로 두고 아래 단축키 누르기! */
            String moveStatementDown = "shift + cmd(⌘) + ↓";
        }
        System.out.println("Move Statement Down to this.");
        System.out.println("Move Statement Down to this.");
        System.out.println("Move Statement Down to this.");
        System.out.println("Move Statement Down to this.");
        System.out.println("Move Statement Down to this.");

        /* 라인 블록단위 올리기 */
        System.out.println("Move Statement Up to this.");
        System.out.println("Move Statement Up to this.");
        System.out.println("Move Statement Up to this.");
        System.out.println("Move Statement Up to this.");
        System.out.println("Move Statement Up to this.");
        for (int i = 0; i < 10; i++) {  /* TODO: 커서는 여기로 두고 아래 단축키 누르기! */
            String moveStatementUp = "shift + cmd(⌘) + ↑";
        }
    }

    /* 커서 선택 늘리기 / 줄이기 */
    public void selection() {
        String extendSelection = "cmd(⌘) + W" + "단어 선택 늘리기";
        String shrinkSelection = "cmd(⌘) + shift + W" + "단어 선택 줄이기";
    }

    /* 라인 복사 / 라인 삭제 / 새 라인 시작하기 */
    public void duplicateLine_DeleteLine_StartNewLine() {
        String DuplicateLine = "cmd(⌘) + D";

        /* TODO : 위의 단축키로 라인 복사를 엄청 해놓고 가장 윗라인으로 가서 다 지워보기*/
        String DeleteLine = "cmd(⌘) + Y";

        String startNewLine = "shift + enter" + "@" + "커서를 @ 앞에 두고 해보세요! 다음 라인 생성할 때 굳이 ;까지 안가도됨!";
    }

    public void cmd_shift_() {
        /* 선택영역 알파벳 대소문자 변경하기 */
        String toggleCase = "cmd(⌘) + shift + U" + "abcde" + "ABCDE";

        /* 히스토리에서 붙여넣기 */
        String pasteFromHistory = "cmd(⌘) + shift + V";
        /* TODO : 문자열 하나씩(First ~ Fifth) Ctrl+ C 누르기 */
        String pasteFromHistory1 = "First";
        String pasteFromHistory2 = "Second";
        String pasteFromHistory3 = "Third";
        String pasteFromHistory4 = "Fourth";
        String pasteFromHistory5 = "Fifth";

        String commentWithBlockComment = "cmd(⌘) + shift + /";
        /* TODO : 아랫 문장들 모두 선택해서 블록 주석으로 만들기 */
        String startBlockComment = "Start~~~~~~~~~~";
        String middleBlockComment = "Middle~~~~~~~~~~";
        String endBlockComment = "End~~~~~~~~~~";

        /* 라인 번호의 라인으로 이동 */
        String line_Column = "cmd(⌘) + G";
    }
}

