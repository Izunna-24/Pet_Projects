package studentGradingApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentGradeTest {
    @Test
     public void numberOfStudentsAndSubjects_givesSizeOfGradingSystemTest(){
        StudentGrade studentGrade = new StudentGrade();
        studentGrade.collectInfo(4,3);
        assertEquals(4,studentGrade.getGradeListSize());
    }

    @Test
    public  void testThatPositiveScoresAreCalculated_andTotalGottenPerStudent(){
        StudentGrade studentGrade = new StudentGrade();
        studentGrade.collectInfo(4,3);
        assertEquals(83.0,studentGrade.calculatesStudentScoreTotal(34,20,29));
    }

    @Test
    public void testThatStudentAverageScoreCanBeGotten(){
        StudentGrade studentGrade = new StudentGrade();
        studentGrade.collectInfo(4,3);
        assertEquals(60.0,studentGrade.getStudentAverage(90, 50, 40));
    }
    @Test
    public void averageClassTotalTest(){
        StudentGrade studentGrade = new StudentGrade();
        studentGrade.collectInfo(4,3);
        int [][] scoreGrades = new int[][]{{23,34,22},{22,56,45,}, {33,44,56,},{67,34,67}};
        assertEquals(41.916666666666664, studentGrade.getClassAverage(scoreGrades));
    }

    @Test
    public void testThatClassTotalFunctionalityWorks(){
        StudentGrade studentGrade = new StudentGrade();
        studentGrade.collectInfo(4,3);
        int [][] scoreGrades = new int[][]{{23,34,22},{22,56,45,}, {33,44,56,},{67,34,67}};
        assertEquals(503.0,studentGrade.getClassTotal(scoreGrades));

    }
    @Test
    public void testThatEnteringNumberOfStudentsLessThanZero_throwsIllegalArgumentException(){
        StudentGrade studentGrade = new StudentGrade();
        assertThrows(IllegalArgumentException.class,()-> studentGrade.collectInfo(-1,2));
    }
    @Test
    public void testThatEnteringNumberOfSubjectLessThanZero_throwsIllegalArgumentException(){
        StudentGrade studentGrade = new StudentGrade();
        assertThrows(IllegalArgumentException.class,()-> studentGrade.collectInfo(2,-3));
    }

    @Test
    public void studentsAreGiven_positionsAreCalculatedTest(){
        StudentGrade studentGrade = new StudentGrade();
        studentGrade.collectInfo(3,3);
        int [][] scoreGrades = new int[][]{{40,56,70},{76,78,90},{87,98,56}};
        int[] positions = {3,1,2};
        assertArrayEquals(positions,studentGrade.calculatePosition(scoreGrades));
    }


}
