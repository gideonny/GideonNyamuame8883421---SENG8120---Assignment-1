public class Main {
    public static int calculateVolumeRectangularPrism(int length, int width, int height) {
        if (length < 0 || width < 0 || height < 0) {
            throw new IllegalArgumentException("Length, width, and height must be positive numbers.");
        }   
        if (length == 0 || width == 0 || height == 0) {
            throw new IllegalArgumentException("At least one dimension is zero. Shape is no longer a 3D shape therefore volume is zero.");
        }
        return length * width * height;
    }   
}