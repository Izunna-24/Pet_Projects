//package serialization;
//
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//public class JsonSerializer {
//
//    public static String  serialize(PersonInJson personInJson) {
//        try{
//            ObjectMapper mapper = new ObjectMapper();
//            String json = mapper.writeValueAsString(personInJson);
//            return json;
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
//        }
//    }
//    public  static PersonInJson deserialize(String json){
//        ObjectMapper mapper = new ObjectMapper();
//        return mapper.convertValue(json, PersonInJson.class);
//    }
//
//
//}
