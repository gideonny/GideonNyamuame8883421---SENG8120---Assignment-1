public class TestMain {
    public static void main(String[] args) {
        testCalculateVolumeRectangularPrism(2, 3, 4, 24);
        testNegativeNumbers(-1, 2, 3); // This should throw an exception
        testForZero(0, 2, 3); // This should through an exception
    }

    // This is a test method for the calculateVolumeRectangularPrism method
    // It checks if the method returns the expected volume for given dimensions
    private static void testCalculateVolumeRectangularPrism(int length, int width, int height, int expectedVolume) {
        int actualVolume = Main.calculateVolumeRectangularPrism(length, width, height);
        if (actualVolume == expectedVolume) {
            System.out.println("Test passed: " + actualVolume);
        } else {
            System.out.println("Test failed: expected " + expectedVolume + ", but got " + actualVolume);
        }
    }

    private static void testNegativeNumbers(int length, int width, int height){
        try {
            Main.calculateVolumeRectangularPrism(length, width, height); //Trying to pass negative numbers
            System.out.println("Test failed: Please input positive numbers");
        } catch (IllegalArgumentException e) {
            System.out.println("Test passed: " + e.getMessage());
        }
    }

    private static void testForZero(int length, int width, int height){
        try {
            Main.calculateVolumeRectangularPrism(length, width, height); //Trying to pass zero
            System.out.println("Test failed: Please input positive numbers");
        } catch (IllegalArgumentException e) {
            System.out.println("Test passed: " + e.getMessage());
        }
    }
}
