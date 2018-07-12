//VS Code로 작성된 파일이기 때문에 컴파일 할 때 
//javac -d [디렉토리명] -encoding utf-8 [자바파일명].java 으로 해줘야 됨.
class UnicodeChar{
    public static void main (String[] args){
        char ch1='A';
        char ch2='한';
        char ch3=0x3091;
        char ch4=0x3092;

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);
    }
}