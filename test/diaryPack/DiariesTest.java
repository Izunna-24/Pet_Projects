package diaryPack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiariesTest {
    private Diaries diaries;

    @BeforeEach
    public void provided(){
        diaries = new Diaries();
    }

    @Test
    public void diaryCanBeAddedToDiaries(){
        diaries.add("User Name", "password");
        assertEquals(1,diaries.getSize());
    }
    @Test
    public void diaryCanBeFoundByUserNameTest(){
        diaries.add("user name", "password");
        diaries.add("person", "pass");
        assertEquals(2,diaries.getSize());
        Diary diary = diaries.findByUserName("person");

        assertEquals("person",diary.getUsername());

    }
    @Test
    public void diaryCanBeDeletedInDiariesTest(){
        diaries.add("user name", "password");
        diaries.add("person", "pass");
        assertEquals(2, diaries.getSize());
        diaries.deleteDiary("person", "pass");
        assertEquals(1,diaries.getSize());

    }
}
