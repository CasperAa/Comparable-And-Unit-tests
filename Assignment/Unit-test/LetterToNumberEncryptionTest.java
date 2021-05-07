import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class LetterToNumberEncryptionTest {


    @Test
    void fromStringToNumber() {

        //Arrange

        //Act
        String word1 = LetterToNumberEncryption.fromStringToNumber("abcd");
        String word2 = LetterToNumberEncryption.fromStringToNumber("efg");
        String word3 = LetterToNumberEncryption.fromStringToNumber("hijk");
        String word4 = LetterToNumberEncryption.fromStringToNumber("lmno");
        String word5 = LetterToNumberEncryption.fromStringToNumber("pqrs");
        String word6 = LetterToNumberEncryption.fromStringToNumber("tuvw");
        String word7 = LetterToNumberEncryption.fromStringToNumber("xyz");



        //Assert
        assertEquals("0123",word1);
        assertEquals("456", word2);
        assertEquals("78910", word3);
        assertEquals("11121314", word4);
        assertEquals("15161718", word5);
        assertEquals("19202122", word6);
        assertEquals("232425", word7);


    }
}