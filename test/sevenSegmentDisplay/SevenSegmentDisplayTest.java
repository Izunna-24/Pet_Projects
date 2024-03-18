package sevenSegmentDisplay;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SevenSegmentDisplayTest {


        @Test
        public void convertStringInput_validInput_returnSegments() {
            SevenSegmentDisplay segment = new SevenSegmentDisplay();
            String input = "11111111";
            boolean[] segments = segment.convertStringInput(input);
            assertArrayEquals(new boolean[]{true, true, true, true, true, true, true, true}, segments);
        }

        @Test
        public void convertStringInput_invalidInput_throwInvalidInputException() {
            SevenSegmentDisplay segment = new SevenSegmentDisplay();
            String input = "01234567";
            assertThrows(WrongInputException.class, () -> segment.convertStringInput(input));
        }

        @Test
        public void convertStringInput_invalidLength_throwInvalidLengthException() {
            SevenSegmentDisplay segment = new SevenSegmentDisplay();
            String input = "111111111";
            assertThrows(InvalidLengthException.class, () -> segment.convertStringInput(input));
        }

        @Test
        public void convertStringInput_emptyInput_throwInvalidLengthException() {
            SevenSegmentDisplay segment = new SevenSegmentDisplay();
            String input = "";
            assertThrows(InvalidLengthException.class, () -> segment.convertStringInput(input));
        }
        @Test
        public void convertStringInput_lengthLessThanEight_throwInvalidLengthException() {
            SevenSegmentDisplay segment = new SevenSegmentDisplay();
            String input = "1111";
            assertThrows(InvalidLengthException.class, () -> segment.convertStringInput(input));
        }

        @Test
        public void convertStringInput_inputWithSpaces_throwInvalidInputException() {
            SevenSegmentDisplay segment = new SevenSegmentDisplay();
            String input = "1 1 1 1 1 1 1 1";
            assertThrows(WrongInputException.class, () -> segment.convertStringInput(input));
        }

        @Test
        public void convertStringInput_inputWithOtherSymbols_throwInvalidInputException() {
            SevenSegmentDisplay segment = new SevenSegmentDisplay();
            String input = "11@11111";
            assertThrows(WrongInputException.class, () -> segment.convertStringInput(input));
        }


        @Test
        public void convertStringInput_invalidCharacter_throwInvalidInputException() {
            SevenSegmentDisplay segment = new SevenSegmentDisplay();
            String input = "11A11111";
            assertThrows(WrongInputException.class, () -> segment.convertStringInput(input));
        }

        @Test
        void convertStringInput_allSegmentsOff_returnAllFalse() {
            SevenSegmentDisplay segment = new SevenSegmentDisplay();
            String input = "00000000";
            boolean[] segments = segment.convertStringInput(input);
            assertArrayEquals(new boolean[]{false, false, false, false, false, false, false, false}, segments);
        }

        @Test
        public void convertStringInput_mixedInput_returnSegments() {
            SevenSegmentDisplay segment = new SevenSegmentDisplay();
            String input = "10011001";
            boolean[] segments = segment.convertStringInput(input);
            assertArrayEquals(new boolean[]{true, false, false, true, true, false, false, true}, segments);
        }

        @Test
        public void testDisplaySevenSegment() {
            SevenSegmentDisplay segment = new SevenSegmentDisplay();

            String expectedAllOn = """
                    # # # #
                    #     #
                    #     #
                    #     #
                    # # # #
                    #     #
                    #     #
                    #     #
                    # # # #""";
            assertEquals(expectedAllOn, segment.showSegments("11111111"));

        }

    }

