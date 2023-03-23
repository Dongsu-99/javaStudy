package MakeCharacter;
public class MyCharRunner {
    public static void main(String[] args) {
        MyChar myChar = new MyChar('a');
        System.out.print("모음인가? =");
        System.out.println(myChar.isVowel());

        System.out.print("모음중 대문자인가? =");
        System.out.println(myChar.isVowelUpperCase());

        System.out.print("숫자인가? =");
        System.out.println(myChar.isDigit());

        System.out.print("알파벳인가? =");
        System.out.println(myChar.isAlphabet());

        System.out.print("자음인가? = ");
        System.out.println(myChar.isConsonant());

        MyChar.printLowerCaseAlpabets();
        MyChar.printUpperCaseAlpabets();
    }
}
