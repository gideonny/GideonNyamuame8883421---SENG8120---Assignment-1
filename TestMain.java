public class TestMain {
    public static void main(String[] args) {
        testCalculateVolumeRectangularPrism(2, 3, 4, 24);
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
}
