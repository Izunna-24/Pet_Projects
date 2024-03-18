package sevenSegmentDisplay;

public class SevenSegmentDisplay {
    private boolean[] segments;

    public SevenSegmentDisplay() {
        segments = new boolean[8];
    }

    public String horizontal_Line() {
        return "# # # #";
    }

    public String verticalLineOnTheLeft() {
        return """
                #
                #
                #""";
    }

    public String verticalLineOnTheRight() {
        return """
                #
                #
                #""";
    }

    public String verticalLineOnBothSides() {
        return """
                #     #
                #     #
                #     #""";
    }

    public String returnVerticalSegments(boolean leftSwitch, boolean rightSwitch) {
        if (leftSwitch && rightSwitch) {
            return verticalLineOnBothSides() + "\n";
        } else if (!leftSwitch && rightSwitch) {
            return verticalLineOnTheRight() + "\n";
        } else {
            return verticalLineOnTheLeft() + "\n";
        }
    }

    public String horizontalSegments(boolean topSwitch) {
        if (topSwitch) {
            return horizontal_Line() + "\n";
        } else {
            return "";
        }
    }

    private void validateInput(String input) {
        for (int check = 0; check < input.length(); check++) {
            if (input.charAt(check) != '0' && input.charAt(check) != '1') {
                throw new WrongInputException("Invalid Input: Only 0s and 1s are allowed.");
            }
        }
    }

    private void validateLength(String input) {
        if (input.length() != 8) {
            throw new InvalidLengthException("The length of your input should be exactly eight");
        }
    }

    public boolean[] convertStringInput(String input) {
        validateInput(input);
        validateLength(input);

        for (int count = 0; count < input.length(); count++) {
            segments[count] = input.charAt(count) == '1';
        }

        return segments;
    }

    public String showSegments(String input) {
        boolean[] array = convertStringInput(input);

        if (!array[7]) {
            return "";
        }

        return horizontalSegments(array[0]) +
                returnVerticalSegments(array[5], array[1]) +
                horizontalSegments(array[6]) +
                returnVerticalSegments(array[4], array[2]) +
                horizontalSegments(array[3]);
    }


}



