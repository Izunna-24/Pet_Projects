package serialization;

import org.junit.jupiter.api.Test;
import sevenSegmentDisplay.Type;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

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
        int noOfDigit = 0;
        assertEquals(noOfDigit, JsonController.countNumberOfDigit(jsonFilePath));
}


    @Test
    public void numberOfSentenceInFileCanBeGottenTest() throws IOException{
        String jsonFilePath = "C:\\Users\\DELL\\Desktop\\filetest.txt";
        String fileContent = new String(Files.readAllBytes(Paths.get(jsonFilePath)));
        int noOfSentence = 2;
        assertEquals(noOfSentence, JsonController.countNumberOfSentence(fileContent));
    }


    @Test
    public void getTransactionsWithinADateTest() throws IOException{
        String jsonFilePath = "C:\\Users\\DELL\\IdeaProjects\\PetWorks\\src\\serialization\\transactions.json";
        String transactionDate = "2024-05-01";
        List<Transaction> result = JsonController.getDailyTransactions(jsonFilePath, transactionDate);
        assertEquals(1,result.size());


    }

    @Test
    public void getAllTransactionsWithinADateRangeTest() throws IOException{
        String jsonFilePath = "C:\\Users\\DELL\\IdeaProjects\\PetWorks\\src\\serialization\\transactions.json";
        String startDate = "2024-05-01";
        String endDate = "2024-05-04";

        List<Transaction> result = JsonController.getAllTransactions(jsonFilePath, startDate, endDate);
        System.out.println(result);
        assertEquals(4,result.size());

    }

    @Test
    public void testToGetTheAverageTransactionAmount_withinAPeriod() throws  IOException{
        String jsonFilePath = "C:\\Users\\DELL\\IdeaProjects\\PetWorks\\src\\serialization\\transactions.json";
        double averageAmountSpent = 2750.00;
        String startDate = "2024-05-01";
        String endDate = "2024-05-04";
       assertEquals(averageAmountSpent, JsonController.getAverageAmountSpent(jsonFilePath,startDate,endDate));
    }

    @Test
    public void getAccountSummaryByAccountNumberTest() throws IOException{
     String jsonFilePath = "C:\\Users\\DELL\\IdeaProjects\\PetWorks\\src\\serialization\\transactions.json";
     AccountSummary expected = new AccountSummary("John Doe",2000.0,1);
     AccountSummary actual = JsonController.getAccountSummaryById(jsonFilePath,"1");
     assertEquals(expected.toString(),actual.toString());

    }


}