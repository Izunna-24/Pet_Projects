package studentGradingApp;

import java.util.Arrays;

public class StudentGrade {
    private int[][] scoreGrade;

    public void collectInfo(int numberOfStudents, int numberOfSubjects) {
        if (numberOfStudents < 0 ){throw new IllegalArgumentException("Invalid number of students");}
        if (numberOfSubjects < 0){throw new IllegalArgumentException("Invalid number of Subjects entered");}
        scoreGrade = new int[numberOfStudents][numberOfSubjects];
    }

    public int getGradeListSize() {
        return scoreGrade.length;
    }

    public double calculatesStudentScoreTotal(int ... scores) {
        double totalScore = 0.0;
        for (int index = 0; index < scoreGrade[0].length; index++) {
            totalScore += scores[index];

        }
        return totalScore;
    }

    public double getStudentAverage(int ...scores) {
        double totalScore = 0.0;
        for (int index = 0; index < scoreGrade[0].length; index++) {
            totalScore += scores[index];
        }
        return totalScore / scoreGrade[0].length;

    }

    public int[][] getGrades() {
        return scoreGrade;
    }

    public double getClassAverage(int[][] classGrades) {
        double totalClassScore = 0.0;
        for (int[] grades : classGrades) {
            for (int count = 0; count < classGrades[0].length; count++) {
                totalClassScore += grades[count];
            }
        }
        return totalClassScore/(classGrades.length * classGrades[0].length);
    }

    public double getClassTotal(int[][] classGrades) {
        double totalClassScore = 0.0;
        for (int[] grades : classGrades) {
            for (int count = 0; count < classGrades[0].length; count++) {
                totalClassScore += grades[count];
            }
        }
        return totalClassScore;
    }
    public int[] calculatePosition(int[][] grades){
        double [] positions = fill_list(grades);
        Arrays.sort(positions);
        double[] newArray = gradesInListReverse(positions);
        return newPositions(grades,positions,newArray);
    }
    private double[] gradesInListReverse(double[] positions){
        double[] newArray = new double[positions.length];
        int index = 0;
        for (int count = positions.length - 1; count >= 0; count --) {
            newArray[index] = positions[count];
            index++;
        }
        return newArray;
    }
    private int[] newPositions(int[][] grades, double [] positions, double[] newArray){
        int [] newPositions = new int[positions.length];
        for (int index = 0; index < positions.length; index++) {
            double scoreTotal = calculatesStudentScoreTotal(grades[index]);
            for (int count = 0; count < positions.length; count++) {
                if (scoreTotal == newArray[count]) newPositions[index]=count+1;

            }

        }
        return newPositions;
    }
    private double[] fill_list(int[][] grades){
        double[] positions = new double[grades.length];
        for (int index = 0; index < grades.length; index++) {
            positions[index] = calculatesStudentScoreTotal(grades[index]);
        }
        return positions;
    }



}
