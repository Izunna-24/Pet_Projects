package chapter14;

public class ReverseString {
    public static String stringReverser(String sentence) {
        StringBuilder newSentence = new StringBuilder();
        StringBuilder reversedSentence = new StringBuilder();

        for (int index = 0; index < sentence.length(); index++) {
            char thisChar = sentence.charAt(index);
            if (thisChar != ' ') {
                newSentence.append(thisChar);
            } else {
                if (!reversedSentence.isEmpty()) {
                    reversedSentence.insert(0, ' ');
                }
                reversedSentence.insert(0, newSentence);
                newSentence.setLength(0);
            }
        }
            if (!reversedSentence.isEmpty()) {
            reversedSentence.insert(0, ' ');
           }
       reversedSentence.insert(0, newSentence);

            return reversedSentence.toString();
        }
    }

