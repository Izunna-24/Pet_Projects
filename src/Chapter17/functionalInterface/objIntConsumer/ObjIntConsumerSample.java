package Chapter17.functionalInterface.objIntConsumer;

import java.util.function.ObjIntConsumer;

public class ObjIntConsumerSample {
    public static void main(String[] args) {

        ObjIntConsumer<School> schools = (school, numberOfBuilding) ->{
            System.out.println(school + " has " + numberOfBuilding + " buildings with " + school.getNumberOfStudents() + " number" +
                    "of building, therefore is the largest");
        };


        School charisInternatonal = new School();
        School koplanSchool = new School();
        School tricrownsInt = new School();
        School starsOkland = new School();

        schools.accept(charisInternatonal, 44);
        schools.accept(koplanSchool, 14);
        schools.accept(tricrownsInt, 20);
        schools.accept(starsOkland, 55);
    }
}
