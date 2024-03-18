package diaryPack;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<Diary> diaries = new ArrayList<>();



    public void add(String userName, String password){
        Diary diary = new Diary(userName,password);
        diaries.add(diary);
    }

    public int getSize() {
        return diaries.size();
    }

    public Diary findByUserName(String username) {
        for(Diary diary: diaries){
            if(diary.getUsername().equals(username)){
                return diary;
            }
        }

        throw new DiaryNotFoundException("Diary not found");
    }

    public void deleteDiary(String username, String password) {
       Diary diary = findByUserName(username);
        diary.unLockDiary(password);
        diaries.remove(diary);
    }
}
