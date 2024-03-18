package personalTasks;

import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total number of students: ");
        int numberOfStudents = input.nextInt();
        System.out.println("Enter" + numberOfStudents + "scores for the students above");
        int scores = input.nextInt();


        int[] students = new int[numberOfStudents];
        for (int index = 0; index < students.length; index++) {
            System.out.println("Student " + students[index] + "score is: ");

        }

        int[] score = new int[scores];
        for (int indeex = 0; indeex < score.length; indeex++) {
            if (score[indeex] >=70){
                System.out.println(" A");
            }

        }
    }
}