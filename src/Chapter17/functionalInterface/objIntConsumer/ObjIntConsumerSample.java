package Chapter17.functionalInterface.objIntConsumer;

import java.util.function.ObjIntConsumer;

public class ObjIntConsumerSample {
    public static void main(String[] args) {

        ObjIntConsumer<School> schools = (school, numberOfBuilding) ->{
            System.out.println(school.getName() + " has " + numberOfBuilding
                    + " buildings with " + school.getNumberOfStudents() + " number of students");
        };


        School school1 = new School("charisInternatonal",800, 9);
        School school2 = new School("koplan",80, 19);
        School school3 = new School("tricrownsInt",120, 88);


        schools.accept(school1, 44);
        schools.accept(school2, 14);
        schools.accept(school3, 20);

    }
}
