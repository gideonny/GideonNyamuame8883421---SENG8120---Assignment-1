public class TestMain {
    public static void main(String[] args) {
        testCalculateVolumeRectangularPrism(2, 3, 4, 24);
        testNegativeNumbers(-1, 2, 3); // This should throw an exception
        testForZero(0, 2, 3); // This should through an exception
        testLargeNumbers(100000, 100000, 100000, 1000000000000000L); // This will overflow int!
        testDecimalNumbers(2.5, 3.0, 4.0, 30.0);
    }

    // This is a test method for the calculateVolumeRectangularPrism method
    // 1) It checks if the method returns the expected volume for given dimensions
    private static void testCalculateVolumeRectangularPrism(int length, int width, int height, int expectedVolume) {
        double actualVolume = Main.calculateVolumeRectangularPrism(length, width, height);
        if (actualVolume == expectedVolume) {
            System.out.println("Test passed: " + actualVolume);
        } else {
            System.out.println("Test failed: expected " + expectedVolume + ", but got " + actualVolume);
        }
    }
    // 2) This is a test to handle negative numbers
    private static void testNegativeNumbers(int length, int width, int height){
        try {
            Main.calculateVolumeRectangularPrism(length, width, height); //Trying to pass negative numbers
            System.out.println("Test failed: Please input positive numbers");
        } catch (IllegalArgumentException e) {
            System.out.println("Test passed: " + e.getMessage());
        }
    }
    // 3) This is a test to handle zero
    private static void testForZero(int length, int width, int height){
        try {
            Main.calculateVolumeRectangularPrism(length, width, height); //Trying to pass zero
            System.out.println("Test failed: Please input positive numbers");
        } catch (IllegalArgumentException e) {
            System.out.println("Test passed: " + e.getMessage());
        }
    }
    // 4) This is a test to handle large numbers
    private static void testLargeNumbers(int length, int width, int height, long expectedVolume){
        try {
            double actualVolume = Main.calculateVolumeRectangularPrism(length, width, height); //Trying to pass large numbers
            if (actualVolume == expectedVolume) {
                System.out.println("Test passed: " + actualVolume);
            } else {
                System.out.println("Test failed: expected " + expectedVolume + ", but got " + actualVolume);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    // 5) This is a test to handle test for decimal numbers
    private static void testDecimalNumbers(double length, double width, double height, double expectedVolume) {
    double actualVolume = Main.calculateVolumeRectangularPrism(length, width, height);
        if (Math.abs(actualVolume - expectedVolume) < 1e-9) {
            System.out.println("Test passed (decimals): " + actualVolume);
        } else {
            System.out.println("Test failed (decimals): expected " + expectedVolume + ", but got " + actualVolume);
        }
}
}
