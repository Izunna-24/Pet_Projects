package serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JsonController {

    public static Transaction[] deserializes(String json) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json,Transaction[].class);
    }

    public static int calculateAmountSubTotal(String jsonFilePath) throws IOException {
     Path path = Paths.get(jsonFilePath);
     String fileContent = Files.readString(path);
     Transaction[] transactions = deserializes(fileContent);
     int amountTotal = 0;
     for(Transaction transaction: transactions){
         amountTotal += transaction.getAmount();
     }
     return amountTotal;
    }


    public static int countNumberOfDigit(String jsonFilePath) throws IOException {
        Path path = Paths.get(jsonFilePath);
        String fileContent = Files.readString(path);
        int digit = 0;
        String regex = ("\\d");
        for(int count =0; count < fileContent.length(); count++) {
            if(String.valueOf(fileContent.charAt(count)).matches(regex)){
                digit++;
            }
        }
        return digit;
    }



    public static int countNumberOfSentence(String fileContent) {
        int numberOfSentence = 0;
        for (int count = 0; count < fileContent.length(); count++) {
            if (fileContent.charAt(count) == '.') {
                numberOfSentence ++;
            }
        }
        return numberOfSentence;
    }


    public static List<Transaction> getDailyTransaction(String date) throws IOException{
        String jsonFilePath = "C:\\Users\\DELL\\IdeaProjects\\PetWorks\\src\\serialization\\transactions.json";
        Path path = Paths.get(jsonFilePath);
        String fileContent = Files.readString(path);
        List<Transaction> transactions = List.of(deserializes(fileContent));
        LocalDate transactDate = LocalDate.parse(date);
        return transactions.stream()
                .filter(transaction -> transaction.getDate().equals(transactDate))
                .collect(Collectors.toList());
    }
}

