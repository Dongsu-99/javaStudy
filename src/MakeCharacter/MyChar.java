package MakeCharacter;

public class MyChar {

    private char ch;

    public MyChar(char ch) {
        this.ch=ch;
    }

    public static void printLowerCaseAlpabets() {
        for(char ch = 'a';ch <='z'; ch++){
            System.out.println(ch);
        }
    }

    public static void printUpperCaseAlpabets() {
        for(char ch = 'A';ch <='Z'; ch++){
            System.out.println(ch);
        }
    }

    public boolean isVowel() {
        if (ch == 'a' || ch =='e' || ch =='i' || ch =='o' || ch =='u')
            return true;

        return false;
    }

    public boolean isVowelUpperCase() {
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
            return true;
        return false;
    }

    public boolean isDigit() {
        if(ch >= 48 && ch <= 57)
            return true;
        return false;
    }

    public boolean isAlphabet() {
        if(ch >= 65 && ch <=90 || ch >= 97 && ch <=122)
            return true;
        return false;
    }

    public boolean isConsonant() {
        if (isAlphabet() && !isVowel() && !isVowelUpperCase())
            return true;
        return false;
    }
}
