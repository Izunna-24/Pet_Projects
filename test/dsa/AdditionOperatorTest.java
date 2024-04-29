package dsa;

import org.junit.jupiter.api.Test;
import personalTasks.Maximum;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionOperatorTest {

    @Test
    public void addingNumbersWithoutAdditionOperatorTest(){
        int result = AdditionOperator.addPlus(0,-1);
        assertEquals(-1,result);
    }

    @Test
    public void addingNumbersWithoutAdditionOperatorTest2(){
        int result = AdditionOperator.addPlusPlus(0,-1);
        assertEquals(-1,result);
    }

    @Test
    public void addingNumbersWithoutAdditionOperatorTest3(){
        int result = AdditionOperator.addPlusPlus(0,-1);
        assertEquals(-1,result);
    }



}


