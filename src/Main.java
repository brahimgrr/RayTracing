import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main {
    private static final double aspectRation = 16.0 / 9.0;

    private static final int imageWidth = 400;
    private static final int imageHeight = (int) (imageWidth / aspectRation);

    private static final double viewPortHeight = 2.0;
    private static final double viewPortWidth = viewPortHeight * (((double) imageWidth) / imageHeight);

    private static final PrintStream out = System.out;

    public static void main(String[] args) throws FileNotFoundException {
        initImage();

        for (int i = 0; i < imageHeight; i++) {
            out.println("Remaining: " + (imageHeight - i));
            for (int j = 0; j < imageWidth; j++) {
                double r = (double) i / (imageWidth - 1);
                double g = (double) j / (imageHeight - 1);
                double b = 0.0;

                Color color = new Color(r, g, b);

                Color.writeColor(color);
            }
        }
        out.println("Done!");
    }

    private static void initImage() throws FileNotFoundException {
        File file = new File("image.ppm");

        FileOutputStream fos = new FileOutputStream(file);

        // Create new print stream for file.
        PrintStream ps = new PrintStream(fos);

        // Set file print stream.
        System.setOut(ps);

        System.out.println("P3");
        System.out.println(imageWidth + " " + imageHeight);
        System.out.println("255");
    }
}
