import java.util.Scanner;

public class LetterToNumberEncryption {
    public static void main(String[] args) {
        //Scanner asking the user for input
        Scanner userWord = new Scanner(System.in);
        System.out.println("Write a word - I'll encrypt it");
        System.out.println(fromStringToNumber(userWord.nextLine()));
    }

    //replacing chars with numbers
    public static String fromStringToNumber(String toBeEncrypted){
        toBeEncrypted = toBeEncrypted.toLowerCase();
        String encryptedWord = toBeEncrypted
                .replace('a','0')
                .replace('b','1')
                .replace('c','2')
                .replace('d','3')
                .replace('e','4')
                .replace('f','5')
                .replace('g','6')
                .replace('h','7')
                .replace('i','8')
                .replace("j","9")
                .replace("k","10")
                .replace("l","11")
                .replace("m","12")
                .replace("n","13")
                .replace("o","14")
                .replace("p","15")
                .replace("q","16")
                .replace("r","17")
                .replace("s","18")
                .replace("t","19")
                .replace("u","20")
                .replace("v","21")
                .replace("w","22")
                .replace("x","23")
                .replace("y","24")
                .replace("z","25");

        //returning the encrypted word
        return encryptedWord;
    }
}
