package diaryPack;

import java.util.Scanner;

public class DiaryApplication {

        private static final Diaries noteTaker = new Diaries();
        private static Scanner inputCollector = new Scanner(System.in);

        public static void main(String[] args) {
            diariesApp();
        }

        public static String input (String prompt) {
            System.out.print(prompt);
            return inputCollector.nextLine();
        }

        public static void diariesApp() {
            System.out.println("""
                1. Create Diary
                2. Unlock Diary
                3. Lock Diary
                4. Delete Diary
                5. Add Entry
                6. Find Entry
                7. Update Entry
                8. Delete Entry
                9. Exit""");
            String option = input("What do you wish to do ); ");
            System.out.println();

            switch(option){
                case "1":
                    String username = input("Enter a username: ");
                    String password = input("Enter a password: ");

                    try {
                        noteTaker.add(username, password);
                        System.out.printf("Your diary %s has been created%n", username);

                    }
                    catch (Exception error) {
                        System.out.println(error.getMessage());
                    }
                    finally {
                        System.out.println();
                        diariesApp();
                    }
                    break;

                case "2":
                    username = input("Enter the username of the diary you want to unlock: ");
                    password = input("Enter the password of the diary to unlock it: ");

                    try{
                        Diary diary = noteTaker.findByUserName(username);
                        diary.unLockDiary(password);
                        System.out.printf("Your diary %s is now unlocked%n", diary.getUsername());
                    }
                    catch (Exception error) {
                        System.out.println(error.getMessage());
                    }
                    finally {
                        System.out.println();
                        diariesApp();
                    }
                    break;

                case "3":
                    username = input("Enter the username of the diary you want to lock: ");

                    try {
                        Diary diary = noteTaker.findByUserName(username);
                        diary.lockDiary();
                        System.out.printf("Your diary %s has been locked%n", diary.getUsername());
                    }
                    catch (Exception error) {
                        System.out.println(error.getMessage());
                    }
                    finally {
                        System.out.println();
                        diariesApp();
                    }
                    break;


                case "4":
                    username = input("Which diary do you want to delete: ");

                    try {
                        noteTaker.findByUserName(username);
                        password = input("Enter the password of the diary you want to delete: ");
                        noteTaker.deleteDiary(username, password);
                        System.out.printf("Your diary %s has been deleted%n", username);
                    }
                    catch (Exception error) {
                        System.out.println(error.getMessage());
                    }
                    finally {
                        System.out.println();
                        diariesApp();
                    }
                    break;

                case "5":
                    username = input("Enter the username of the diary you want to add entry to: ");

                    try{
                        Diary diary = noteTaker.findByUserName(username);
                        String title = input("Enter a title of your entry: ");
                        String body = input("Enter the body of your entry: ");
                        //int entryId = diary.createEntry(title, body).get();
                        System.out.printf("Entry %s has been created in %s%n", title, diary.getUsername());
                        //System.out.printf("Entry %s ID is %d%n", title, entryId);
                    }
                    catch (Exception error) {
                        System.out.println(error.getMessage());
                    }
                    finally {
                        System.out.println();
                        diariesApp();
                    }
                    break;

                case "6":
                    username = input("Enter the username of the diary you wish to find: ");

                    try {
                        Diary diary = noteTaker.findByUserName(username);
                        String entryId = input("Enter the ID ");
                        Entry entry = diary.findEntryById(Integer.parseInt(entryId));
                        System.out.printf("Entry %s title: %s%n", entryId, entry.getTittle());
                        System.out.printf("Entry %s body: %s%n", entryId, entry.getBody());
                    }
                    catch (Exception error) {
                        System.out.println(error.getMessage());
                    }
                    finally {
                        System.out.println();
                        diariesApp();
                    }
                    break;

                case "7":
                    username = input("Enter the username of the diary with the entry you want to update: ");

                    try {
                        Diary diary = noteTaker.findByUserName(username);
                        String entry_id = input("Entry the ID of the entry: ");
                        String title = input("Enter updated title: ");
                        String body = input("Enter updated body: ");
                        diary.updateEntry(Integer.parseInt(entry_id), title, body);
                        System.out.printf("Entry %s has been updated%n", entry_id);
                    }
                    catch (Exception  error) {
                        System.out.println(error.getMessage());
                    }
                    finally {
                        System.out.println();
                        diariesApp();
                    }
                    break;

                case "8":
                    username = input("Enter the username of the diary with the entry you want to delete: ");

                    try {
                        Diary diary = noteTaker.findByUserName(username);
                        String entryId = input("Enter the ID of the entry you want to delete: ");
                        diary.deleteEntry(Integer.parseInt(entryId));
                        System.out.printf("Entry %s has been deleted from %s%n",entryId, diary.getUsername() );
                    }
                    catch (Exception error) {
                        System.out.println(error.getMessage());
                    }
                    finally {
                        System.out.println();
                        diariesApp();
                    }
                    break;

                case "9":
                    System.exit(0);

                default:
                    diariesApp();
            }

        }

    }



