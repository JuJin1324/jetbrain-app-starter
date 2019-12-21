# Intellij IDEA 시작하기

## IDEA 단축키 ctrl -> command 변경
* 환경설정 : command + , -> Keymap 이동 -> dropdown 메뉴에서 Mac OS X 으로 변경 후 Main menu > edit 에서 변경확인  
[How to use Mac OSX Keymap on Windows for WebStorm or IntelliJ IDEA?](https://stackoverflow.com/questions/42422318/how-to-use-mac-osx-keymap-on-windows-for-webstorm-or-intellij-idea/42422764#42422764)

## 단축키 정리
* 해당키에는 커스텀으로 변경한 키가 있습니다.  
※ 단축키에 대문자 알파벳은 보기 편하기 위해서 표기하였습니다.   
대문자로 표기만 하였을 뿐 해당 대문자가 shift + 소문자가 아닙니다.

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
선택 라인 위로 이동(Move Line Down) | shift + alt(⌥) + ↑ | shift + alt + ↑
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
해당 라인으로 이동(Line/Column...) | cmd(⌘) + G | ctrl + G
되돌리기 | cmd(⌘) + Z | ctrl + Z

### 윈도우
설명       |   macOS   |  Windows
--------- | --------- | ---------
탭 닫기(Editor Tabs - Close) | cmd(⌘) + F4 | ctrl + F4
다음 탭으로 이동(Select Next Tab) | ctrl(^) + →  | 모름
이전 탭으로 이동(Select Previous Tab) | ctrl(^) + ← | 모름
Edit 화면만 나오고 나머지 숨기기 | cmd(⌘) + shift + F12	| ctrl + shift + F12 
스플릿뷰 오른쪽 생성(Split Vertically) | ctrl(^) + alt(⌥) | ] | 모름
스플릿뷰 모두 없애기(Unsplit All) | ctrl(^) + alt(⌥) | [ | 모름
윈도우 오른쪽으로 줄이기/늘리기 Stretch to Right | cmd(⌘) + shift + → | 모름
윈도우 왼쪽으로 줄이기/늘리기 Stretch to Right | cmd(⌘) + shift + ← | 모름

### 코드 탐색
설명       | macOS     |  Windows  
--------- | --------- | ---------
마지막 Edit 하던거로 돌아가기(Last Edit Location)	| cmd(⌘) + shift + delete	| ctrl + shift + backspace 
최근 수정한 파일 목록(Recent Files)	| cmd(⌘) + E        | ctrl + E 
Method Hierarchy | cmd(⌘) + shift + H | ctrl + shift + H
Find Usages | alt(⌥) + F7 | alt + F7
Find and Replace | cmd(⌘) + R | ctrl + R
Find | cmd(⌘) + F | ctrl + F
Find in path | cmd(⌘) + shift + F 또는 ctrl(^) + shift + F | ctrl + shift + F
선언부 이동 | cmd(⌘) + B | ctrl + B
구현부 이동 | cmd(⌘) + alt(⌥) + B | ctrl + alt + B
이전 작업으로 이동 | cmd(⌘) + alt(⌥) + ← | ctrl + alt + ←
기존 작업으로 이동 | cmd(⌘) + alt(⌥) + → | ctrl + alt + →

### 리펙토링
설명       | macOS     |  Windows  
--------- | --------- | ---------
리펙토링 메뉴(Refactor This)	       | cmd(⌘) + alt(⌥) + shift + T     | ctrl + alt + shift + T 
소스를 메서드로 추출	       | cmd(⌘) + alt(⌥) + M | ctrl + alt + M 
소스를 변수로 추출          | cmd(⌘) + alt(⌥) + V | ctrl + alt + V 
소스를 멤버변수(필드)로 추출  | cmd(⌘) + alt(⌥) + F | ctrl + alt + F 
소스를 상수로 추출          | cmd(⌘) + alt(⌥) + C | ctrl + alt + C
변수 메서드 파라미터로 추출 | cmd(⌘) + alt(⌥) + P | ctrl + alt + P
감싸기 코드 생성(if/foreach/for/try catch등) | cmd(⌘) + alt(⌥) + T | ctrl + alt + T
test 메서드 만들기(이미 존재하면 해당 메서드로 이동)	     | cmd(⌘) + shift + T   | ctrl + shift + T 
import 최적화 | cmd(⌘) + alt(⌥) + O | ctrl + alt + O
전체 들여쓰기 재정렬 | cmd(⌘) + alt(⌥) + L | ctrl + alt + L
메서드 형태 변화 | cmd(⌘) + F6 | 모름 
Rename | shift + F6 | shift + F6

### Run/Debug
설명       | macOS     |  Windows  
--------- | --------- | ---------
Run 현재 커서가 있는 클래스의 main(Run context configuration) | cmd(⌘) + shift + F10 | ctrl + shift + F10
Run | shift + F10 | shift + F10
Run 목록 | alt(⌥) + shift + F10 | alt + shift + F10
Stop | cmd(⌘) + F2 | 모름
Debug 현재 커서가 있는 클래스의 main | cmd(⌘) + shift + F9 | ctrl + shift + F9
Debug 마지막으로 Run한 main(Debug context configuration) | shift + F9 | shift + F9
Debug 목록 | alt(⌥) + shift + F9 | alt + shift + F9
Step Over | F8 | F8
Step Out | shift + F8 | shift + F8
Step Into | F7 | F7

### VCS
설명       | macOS     |  Windows  
--------- | --------- | ---------
Fetch     |  cmd(⌘) + T | ctrl + T
Commit    |  cmd(⌘) + K | ctrl + K
Push      |  cmd(⌘) + shift + K | ctrl + shift + K
Pull      |  cmd(⌘) + shift + P | 모름

### 인텔리J
설명       | macOS     |  Windows  
--------- | --------- | ---------
Preferences | cmd(⌘) + , | ctrl + shift + S 
reveal in Finder | cmd(⌘) + alt(⌥) + F12 | 모름
Project Structure | cmd(⌘) + ;           | 모름
Generate | ctrl + enter | 모름
프로젝트 열기(Open...) | cmd(⌘) + shift + O | 모름

### 탐색
설명       | macOS     |  Windows  
--------- | --------- | ---------
액션 찾기	  | cmd(⌘) + shift + A  | ctrl + shift + A 
클래스 찾기  | cmd(⌘) + N | ctrl + N
현재 편집중인 파일을 프로젝트 탭에서 보기 | alt(⌥) + F1
북마크 보기(Show Bookmarks) | shift + F11
북마크 추가(Toogle Bookmark) | F11

### 플러그인
설명  | macOS | Windows | 플러그인
--------- | --------- | --------- | ---------
화면 vertical 분할 | cmd(⌘) + alt(⌥) + [ 혹은 ] | ctrl + alt + [ 혹은 ]  | Tab Shifter
분할 화면 사이 커서 넘어다니기 | cmd(⌘) + alt(⌥) + shift + [ 혹은 ]

## IDEA 플러그인
### Grep Console
* 설정한 로그 마다의 색을 변경하여 구분하기 좋음

### Presentation Assistant(Preferred)
* 단축키 입력 혹은 단축키가 있는 액션을 할 경우 화면에 단축키를 띄어줌

### Lombok
* 말이 필요 없음. 롬복 사용을 위한 설치

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

### Json2Java4Idea
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
