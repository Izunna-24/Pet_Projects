package serialization;

import org.junit.jupiter.api.Test;
import sevenSegmentDisplay.Type;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class JsonControllerTest {
    @Test
    public void calculateSubTotalOfAmount() throws IOException {
        String jsonFilePath = "C:\\Users\\DELL\\IdeaProjects\\PetWorks\\src\\serialization\\transactions.json";
        int totalAmount = 11000;
        Transaction transaction = new Transaction();
        transaction.setAmount(4000);
        transaction.setType(Type.CREDIT);
        transaction.setDate(LocalDate.parse("2024-04-03"));
        transaction.setName("Joe Doe");
        transaction.setId("1");
        System.out.println(transaction);
        assertEquals(totalAmount, JsonController.calculateAmountSubTotal(jsonFilePath));
    }

@Test
    public void numberOfDigitInFileCanBeGottenTest() throws  IOException{
        String jsonFilePath = "C:\\Users\\DELL\\Desktop\\you have 100 men.txt";
        int noOfDigit = 3;
        assertEquals(noOfDigit, JsonController.countNumberOfDigit(jsonFilePath));
}


    @Test
    public void numberOfSentenceInFileCanBeGottenTest() throws IOException{
        String jsonFilePath = "C:\\Users\\DELL\\Desktop\\filetest.txt";
        String fileContent = new String(Files.readAllBytes(Paths.get(jsonFilePath)));
        int noOfSentence = 2;
        assertEquals(noOfSentence, JsonController.countNumberOfSentence(fileContent));
    }

}