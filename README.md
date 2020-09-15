# Jetbrain-App-Starter
Jetbrain 제품 응용프로그램들 공통 시작하기

### .gitignore 에 파일 추가 안될때
터미널에 `git rm -rf --cached .`

## macOS
### File Header 추가
소스 파일을 생성할 때 마다 자동으로 파일의 최상단에 생성할 주석 코드(예: 저작권, 파일 소유자, 파일 생성자, 생성일 등의 정보)
* Preference(Command + ,) -> Editor -> File and Code Templates -> include 탭 -> + 버튼
```java
/**
 * Created by Yoo Ju Jin(jujin1324@daum.net)
 * Created Date : 2019-09-15
 */
```
APPLY 버튼 -> OK 버튼

### 단축키 ctrl -> command 변경
환경설정 : command + , -> Keymap 이동 -> dropdown 메뉴에서 Mac OS X 으로 변경 후 Main menu > edit 에서 변경확인  
[How to use Mac OSX Keymap on Windows for WebStorm or IntelliJ IDEA?](https://stackoverflow.com/questions/42422318/how-to-use-mac-osx-keymap-on-windows-for-webstorm-or-intellij-idea/42422764#42422764)

## 단축키 정리
해당키에는 커스텀으로 변경한 키가 있습니다. - [커스텀] 표시가 붙습니다.  
※ 단축키에 대문자 알파벳은 보기 편하기 위해서 표기하였습니다. 대문자로 표기만 하였을 뿐 해당 대문자가 shift + 소문자가 아닙니다.

### 커서 
설명       |   macOS   |  Windows
--------- | --------- | ---------
다음 단어로 커서 이동(Move Caret to Next Word) | alt(⌥) + → | ctrl + → 
이전 단어로 커서 이동(Move Caret to Previous Word) | alt(⌥) + ← | ctrl + ←
라인 시작으로 커서 이등(Move Caret to Line Start) | cmd(⌘) + ← | home
라인 끝으로 이등(Move Caret to Line End) | cmd(⌘) + → | end
다음 메서드(Next Method) | alt(⌥) + ↓ | alt + ↓
이전 메서드(Previous Method) | alt(⌥) + ↑ | alt + ↑
선택 라인 아래로 이동(Move Line Down) | shift + alt(⌥) + ↓ | shift + alt + ↓
선택 라인 위로 이동(Move Line Up) | shift + alt(⌥) + ↑ | shift + alt + ↑
선택 라인 블록단위 문자열 아래로 이동(Move Statement Down) | shift + cmd(⌘) + ↓ | 모름 
선택 라인 블록단위 문자열 위로 이동(Move Statement Down) | shift + cmd(⌘) + ↑ | 모름 
Page Up(Page Up)   | fn + ↑ | Page Up
Page Down(Page Down) | fn + ↓ | Page Down
맨 위로 커서 올리기(Move Caret to Text Start) | Home | Home
맨 아래로 커서 내리기(Move Caret to Text End | End | End
단어 선택 늘리기(Extend Selection)  | cmd(⌘) + W | ctrl + W 
단어 선택 줄이기(Shrink Selection)	| cmd(⌘) + shift + W | ctrl + shift + W 
커서 라인 문장 복사하기(Duplicate Line or Selection)	       	| cmd(⌘) + D | ctrl + D
커서 라인 문장 지우기(Delete Line)	       	| cmd(⌘) + Y | ctrl + Y
커서 밑으로 라인 만들기(Start New Line)	        | shift + enter | shift + enter
선택영역 대소문자변경(Toggle Case) | cmd(⌘) + shift + U | ctrl + shift + U
여러번 ctrl+c 후 붙여넣기 선택(Paste from Histroy...) | cmd(⌘) + shift + V | ctrl + shift + V
/**/ 주석(Comment with Block Comment) | cmd(⌘) + shift + / | ctrl + shift + /
라인 번호의 라인으로 이동(Line/Column...) | cmd(⌘) + G | ctrl + G

### 윈도우
설명       |   macOS   |  Windows
--------- | --------- | ---------
다음 탭으로 이동(Select Next Tab) | ctrl(^) + →  | 모름
이전 탭으로 이동(Select Previous Tab) | ctrl(^) + ← | 모름
탭 닫기(Editor Tabs - Close) | cmd(⌘) + F4 | ctrl + F4
Edit 화면만 나오고 나머지 숨기기(Hide All Tool Windows) | cmd(⌘) + shift + F12	| ctrl + shift + F12 
스플릿 탭 오른쪽 생성(Split Vertically) | ctrl(^) + alt(⌥) + ] | 모름
스플릿 탭 모두 없애기(Unsplit All) | ctrl(^) + alt(⌥) + [ | 모름
포커스 오른쪽 탭으로 이동(Move Focus Right) - Tab shifter(Plugin) | ctrl(^) + alt(⌥) + shift + ] | 모름
포커스 왼쪽 탭으로 이동(Move Focus Left) - Tab shifter(Plugin) | ctrl(^) + alt(⌥) + shift + [ | 모름
윈도우 오른쪽으로 줄이기/늘리기(Stretch to Right) | cmd(⌘) + shift + → | 모름
윈도우 왼쪽으로 줄이기/늘리기(Stretch to Left) | cmd(⌘) + shift + ← | 모름

### 코드 탐색
설명       | macOS     |  Windows  
--------- | --------- | ---------
마지막 Edit 하던거로 돌아가기(Last Edit Location)	| cmd(⌘) + shift + delete	| ctrl + shift + backspace 
최근 수정한 파일 목록(Recent Files)	| cmd(⌘) + E        | ctrl + E 
최근 수정한 위치 목록(Recent Locations) | cmd(⌘) + shift + E | 모름
선언부 이동(Declaration or Usages) | cmd(⌘) + B | ctrl + B
구현부 이동(implementation(s)) | cmd(⌘) + alt(⌥) + B | ctrl + alt + B
메서드 계층보기(Method Hierarchy) | cmd(⌘) + shift + H | ctrl + shift + H
Find Usages | alt(⌥) + F7 | alt + F7
Find | cmd(⌘) + F | ctrl + F
Find and Replace | cmd(⌘) + R | ctrl + R
Find in path | cmd(⌘) + shift + F 또는 ctrl(^) + shift + F | ctrl + shift + F
Find in All | shift + shift | shift + shift
이전 작업으로 이동(Back) | cmd(⌘) + alt(⌥) + ← | ctrl + alt + ←
기존 작업으로 이동(Forward) | cmd(⌘) + alt(⌥) + → | ctrl + alt + →

### 리펙토링
설명       | macOS     |  Windows  
--------- | --------- | ---------
리펙토링 메뉴(Refactor This)	       | cmd(⌘) + alt(⌥) + shift + T     | ctrl + alt + shift + T 
소스를 메서드로 추출(Extract Method...)	       | cmd(⌘) + alt(⌥) + M | ctrl + alt + M 
소스를 변수로 추출(Introduce Variable...)          | cmd(⌘) + alt(⌥) + V | ctrl + alt + V 
소스를 멤버변수(필드)로 추출(Introduce Field)  | cmd(⌘) + alt(⌥) + F | ctrl + alt + F 
소스를 상수로 추출(Introduce Constant)          | cmd(⌘) + alt(⌥) + C | ctrl + alt + C
변수 메서드 파라미터로 추출(Introduce Parameter) | cmd(⌘) + alt(⌥) + P | ctrl + alt + P
감싸기 코드 생성(if/foreach/for/try catch등)(Surround With...) | cmd(⌘) + alt(⌥) + T | ctrl + alt + T
test 만들기(이미 존재하면 해당 메서드로 이동)(Test)	     | cmd(⌘) + shift + T   | ctrl + shift + T 
import 최적화(Optimize Imports) | cmd(⌘) + alt(⌥) + O | ctrl + alt + O
전체 들여쓰기 재정렬(Reformat Code) | cmd(⌘) + alt(⌥) + L | ctrl + alt + L
메서드 형태 변화(Change Signature...) | cmd(⌘) + F6 | 모름 
Rename | shift + F6 | shift + F6

### Run/Debug
설명       | macOS     |  Windows  
--------- | --------- | ---------
Run 현재 커서가 있는 클래스의 main(Run context configuration) | cmd(⌘) + shift + F10 | ctrl + shift + F10
Run | shift + F10 | shift + F10
Run 목록(Run...) | alt(⌥) + shift + F10 | alt + shift + F10
Stop | cmd(⌘) + F2 | 모름
Debug | shift + F9 | shift + F9
Debug 현재 커서가 있는 클래스의 main(Debug context configuration) | cmd(⌘) + shift + F9 | ctrl + shift + F9
Debug 목록(Debug...) | alt(⌥) + shift + F9 | alt + shift + F9
Step Over | F8 | F8
Step Out | shift + F8 | shift + F8
Step Into | F7 | F7

### VCS
설명       | macOS     |  Windows  
--------- | --------- | ---------
Fetch     |  cmd(⌘) + T | ctrl + T
Commit    |  cmd(⌘) + K | ctrl + K
Push      |  cmd(⌘) + shift + K | ctrl + shift + K
Pull[커스텀]      |  cmd(⌘) + shift + P | 모름

### System
설명       | macOS     |  Windows  
--------- | --------- | ---------
환경설정(Preferences) | cmd(⌘) + , | ctrl + shift + S 
파인더(윈도우 탐색기)에서 보기(reveal in Finder) | cmd(⌘) + alt(⌥) + F12 | 모름
프로젝트 구조 설정(Project Structure) | cmd(⌘) + ;           | 모름
생성하기(Generate) | ctrl + enter | 모름
프로젝트 열기(Open...)[커스텀] | cmd(⌘) + shift + O | 모름

### 탐색
설명       | macOS     |  Windows  
--------- | --------- | ---------
액션 찾기(Find Action...)	  | cmd(⌘) + shift + A  | ctrl + shift + A 
현재 편집중인 파일을 프로젝트 탭에서 보기 | alt(⌥) + F1
북마크 보기(Show Bookmarks) | shift + F11
북마크 추가(Toogle Bookmark) | F11

## 플러그인
### Material Theme UI
* 응용프로그램 UI 테마 변경 플러그인

### Grep Console
* 설정한 로그 마다의 색을 변경하여 구분하기 좋음

### Presentation Assistant
* 단축키 입력 혹은 단축키가 있는 액션을 할 경우 화면에 단축키를 띄어줌

### Lombok
* Plain Java 클래스 생성시에 Constructor/Setter/Getter/toString 등 필요한 메서드를 애노테이션을 사용하여 자동 생성시켜주는 롬복 라이브러리의 
사용을 IDE가 문법적으로 인지할 수 있도록 하는 라이브러리(롬복 사용을 위해서는 maven이나 gradle로 롬복 디펜던시 추가 필요.)

### GenerateSerialVersionUID
* 클래스 안에서 Alt + Insert(Windows) 단축키에 자동 UID 생성 메뉴

### .ignore
* .gitIgnore 파일에 탬플릿을 이용하여 git ignore할 파일 지정

### JS GraphQL
* javascript 파일 syntax, error highlighting 등등 기능 제공

### Acejump
* ctrl + ; 를 통해서 특정 문자열로 이동시켜주는 플러그인

### String Manipulation
* 문자열 변경 및 특정 규칙 생성 해주는 플러그인. 우클릭에서 String Manipulation 메뉴를 보면 유용

### RoboPOJOGene
* 자바 클래스 생성시에 json sample을 넣어서 생성할 수 있도록 해주는 플러그인   
* 설치 후 패키지에 우클릭 > New > Java class from json 항목이 나옴.

### BashSupport
* 인텔리J 에서 .sh 파일 수정 시에 문법 잡아줌.

### Properties to YAML Converter
* .properties 파일을 yaml 로 만들어줌.
* 사용예) .properties 파일에 우클릭 > Convert Properties to YAML 항목 클릭

### Tab Shifter
* ctrl + alt + [ 혹은 ctrl + alt + ] 로 인텔리J 창 옮겨다니기

## Google Cloud Repository
[Wiki](https://github.com/JuJin1324/Intellij-IDEA-Starter/wiki/Google-Cloud-Repository-%EC%97%B0%EB%8F%99)
