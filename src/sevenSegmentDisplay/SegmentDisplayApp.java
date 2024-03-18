package sevenSegmentDisplay;
import java.util.Scanner;
public class SegmentDisplayApp {
        private static boolean isValidInput = false;
        private static final Scanner input = new Scanner(System.in);
        private static final SevenSegmentDisplay sevenSegment = new SevenSegmentDisplay();



        public static void main(String[] args) {

            while (!isValidInput) {
                System.out.println("Enter binaries of length 8:");
                String userInput = input.nextLine();

                try {
                    String display = sevenSegment.showSegments(userInput);
                    if (!display.isEmpty()) {
                        System.out.println(display);
                        isValidInput = true;
                    } else {
                        System.out.println("Invalid input!");
                    }
                } catch (WrongInputException e) {
                    System.out.println("Invalid input!");
                } catch (InvalidLengthException e) {
                    System.out.println("Invalid length!");
                }
            }
        }
    }

