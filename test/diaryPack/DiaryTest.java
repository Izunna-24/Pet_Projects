package diaryPack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary diary;

    @BeforeEach
    public void givenAlways(){
        diary = new Diary("password","username");
    }

@Test
    public void diaryIsUnlocked_diaryCanBeLockedTest() {
    assertFalse(diary.isLocked());
    diary.lockDiary();
    assertTrue(diary.isLocked());
}

@Test
public void diaryIsUnlockedAtCreationTest(){
        assertFalse(diary.isLocked());
}

@Test
public void diaryIsUnlocked_diaryCanTakeEntryTest(){
        assertEquals(0, diary.diaryBody());
        diary.createEntry("tittle", "body");
        assertEquals(1,diary.diaryBody());
    }

    @Test
    public void diaryIsUnlocked_diaryCanDeleteEntryTest(){
        assertEquals(0, diary.diaryBody());
        diary.createEntry("tittle", "body");
        assertEquals(1,diary.diaryBody());
        diary.deleteEntry(1);
        assertEquals(0,diary.diaryBody());
    }

    @Test
    public void diaryIsUnlocked_diaryCanUpdateEntryTest(){
        assertEquals(0, diary.diaryBody());
        diary.createEntry("tittle", "body");
        assertEquals(1,diary.diaryBody());
        assertEquals("tittle", diary.findEntryById(1).getTittle());
        assertEquals("body", diary.findEntryById(1).getBody());
        diary.updateEntry(1, "Exam", "Subjects");
        assertEquals("Exam", diary.findEntryById(1).getTittle());
        assertEquals("Subjects", diary.findEntryById(1).getBody());
    } @Test
    public void searchDiaryForAnEntry_entryNotFound_throwEntryNotFoundExceptionTest(){
        diary.createEntry("tittle","body");
        diary.createEntry("tittle2","body2");
        assertEquals(2,diary.diaryBody());
        assertThrows(EntryNotFoundException.class, ()-> diary.findEntryById(3));


    }
    @Test
    public void unlockDiaryWithIncorrectPassword_throwsIncorrectPasswordException(){
        diary.lockDiary();
        assertTrue(diary.isLocked());
        assertThrows(IncorrectPasswordException.class, ()-> diary.unLockDiary("password incorrect"));
    }
}


