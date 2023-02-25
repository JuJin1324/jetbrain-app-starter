package keymap.practice;

import keymap.practice.methodHierarchy.ChildClass;
import keymap.practice.methodHierarchy.ParentClass;

/**
 * Created by Yoo Ju Jin(yjj@hanuritien.com)
 * Created Date : 2019/12/25
 */
public class Refactoring {

    public static void main(String[] args) {
        /* 리펙토링 메뉴 - TODO : 아래 new ParentClass()에 커서 두고 단축키 쓴 후 Introduce variable 선택 */
        String refactorThis = "cmd(⌘) + alt(⌥) + shift + T";
        new ParentClass();

        /* 소스를 메서드로 추출 - TODO : 아래 두개의 for문 중 첫번째 for문에서 메서드로 추출해서 두번째 for 문도 변경하기 - 메서드명: iteratePrint */
        String extractMethod = "cmd(⌘) + alt(⌥) + M";

        for (int i = 0; i < 30; i++) {
            System.out.println("i = " + i);
        }
        for (int i = 0; i < 90; i++) {
            System.out.println("i = " + i);
        }

        /* 소스를 변수로 추출 */
        String introduceVariable = "cmd(⌘) + alt(⌥) + V";
        new ChildClass();

        /* 소스를 멤버변수(필드)로 추출 - TODO : macOS 기본 단축키 해제 - 키보드 > 단축키 > Spotlight > Finder 검색 윈도우 보기 체크 해제 */
        String introduceField = "cmd(⌘) + alt(⌥) + F";
        new ParentClass();

        /* 소스를 상수로 추출 */
        String introduceConstant = "cmd(⌘) + alt(⌥) + C";
        new ChildClass();

        /* 변수 메서드 파라미터로 추출 - TODO : parameterTest 내부의 변수 parameter에 커서 가져다 놓고 단축키 실행 */
        String introduceParameter = "cmd(⌘) + alt(⌥) + P";
        parameterTest();

        /* 감싸기 코드 생성(if/foreach/for/try catch등) - TODO : int c = a/b 에 감싸기 코드로 try/catch 삽입해보기 */
        String surroundWith = "cmd(⌘) + alt(⌥) + T";
        int a = 100, b = 10;
        int c = a / b;    /* a/b 시에 혹시 b가 0이면 ArithmeticException이 발생함으로 예외처리 해야함 */

        /* test 메서드 만들기(이미 존재하면 해당 메서드로 이동) */
        String test = "cmd(⌘) + shift + T";

        /* import 최적화 */
        String optimizeImports = "cmd(⌘) + alt(⌥) + O";

        /* 전체 들여쓰기 재정렬 */
        String reformatCode = "cmd(⌘) + alt(⌥) + L";
        String thisWillBeReformatted = "This"+"Will"+"Be"+"Reformatted";

        /* 메서드 형태 변화 - TODO : parameterTest 메서드로 커서 옮긴 후에 단축키로 메서드 이름은 signatureTest 변경 및 파라미터 String param1 추가 해보기 */
        String changeSignature = "cmd(⌘) + F6";
        parameterTest();

        /* Rename */
        String rename = "shift + F6";
        String renameThisString = "Rename This String -> renamed";
    }

    public static void parameterTest() {
        int parameter = 55;
        System.out.println(parameter + " + " + parameter + " = " + (parameter + parameter));
    }

}
