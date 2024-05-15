package serialization;

import org.junit.jupiter.api.Test;


import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static serialization.Gender.MALE;

class JsonSerializerTest {

    @Test
    public void testSerialize(){
        PersonInJson personInJson = new PersonInJson();
        personInJson.setName("Perry");
        personInJson.setGender(Gender.SHIM);
        personInJson.setPhoneNumber("09078654387");
        personInJson.setDateOfBirth(LocalDate.now());


       String json = JsonSerializer.serialize(personInJson);
      // String expected = {};
   }
   @Test
    public void testDeserialize(){
    PersonInJson personInJson = new PersonInJson();
        String json = JsonSerializer.serialize(personInJson);
        PersonInJson personFromJson = JsonSerializer.deserialize(json);
        assertNotNull(personFromJson);

   }

}