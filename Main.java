public class Main {
    public static int calculateVolumeRectangularPrism(int length, int width, int height) {
        if (length <= 0 || width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Length, width, and height must be positive numbers.");
        }   
        return length * width * height;
    }   
}