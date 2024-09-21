public class Color extends Vec3 {
    public Color(double r, double g, double b) {
        super(r, g, b);
    }

    public static void writeColor(Color color) {
        double r = color.x;
        double g = color.y;
        double b = color.z;

        int ir = (int) (255.999 * r);
        int ig = (int) (255.999 * g);
        int ib = (int) (255.999 * b);

        System.out.println(ir + " " + ig + " " + ib);
    }
}
