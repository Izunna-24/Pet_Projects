package serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonController {

    public static Transaction[] deserializes(String jason) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(jason,Transaction[].class);
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


}
