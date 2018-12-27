package javaclass_27.pkg12.pkg18;

public class Page224_RandomCharacter {

    //Generate a random character between ch1 and ch2
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    // Get Random lower case latter
    public static char getRandomLowerCaseLatter() {
        return getRandomCharacter('a', 'z');
    }

    // Generate a random uppercase letter
    public static char getRandomUpperCaseLatter() {
        return getRandomCharacter('A', 'Z');
    }

    // Generate a random digit character
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    // Generate a random character
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
