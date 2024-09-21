public class Ray {
    private Point3 orig;
    private Vec3 dir;

    public Ray() {

    }

    public Ray(Point3 origin, Vec3 direction) {
        this.orig = origin;
        this.dir = direction;
    }

    public Point3 at(double k) {
        Vec3 scaledDir = Vec3.mul(dir, k);
        return (Point3) Point3.add(orig, scaledDir);
    }
}
