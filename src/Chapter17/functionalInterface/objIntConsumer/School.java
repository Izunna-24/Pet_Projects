package Chapter17.functionalInterface.objIntConsumer;

public class School {
    private String name;
    private int numberOfStudents;
    private int numberOfClasses;


    public School(String name, int numberOfStudents, int numberOfClasses) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.numberOfClasses = numberOfClasses;
    }

    @Override
    public String toString(){
        return "{" + name + ", has " + numberOfClasses +
                " classes and " + numberOfStudents + " number of students }";
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }
}
