public class Vec3 {
    public double x, y, z;

    public Vec3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vec3() {}

    public Vec3 inverse() {
        return new Vec3(-this.x, -this.y, -this.z);
    }

    public Vec3 add(Vec3 other) {
        x += other.x;
        y += other.y;
        z += other.z;

        return this;
    }

    public Vec3 sub(Vec3 other) {
        x -= other.x;
        y -= other.y;
        z -= other.z;

        return this;
    }

    public Vec3 mul(double k) {
        x *= k;
        y *= k;
        z *= k;

        return this;
    }

    public Vec3 div(double k) {
        return mul(1/k);
    }

    public double lengthSquared() {
        return x * x + y * y + z * z;
    }

    public double length() {
        return Math.sqrt(lengthSquared());
    }

    public static Vec3 add(Vec3 left, Vec3 right) {
        return new Vec3(left.x + right.x, left.y + right.y, left.z + right.z);
    }

    public static Vec3 sub(Vec3 left, Vec3 right) {
        return new Vec3(left.x - right.x, left.y - right.y, left.z - right.z);
    }

    public static Vec3 mul(Vec3 left, Vec3 right) {
        return new Vec3(left.x * right.x, left.y * right.y, left.z * right.z);
    }

    public static Vec3 div(Vec3 left, Vec3 right) {
        return new Vec3(left.x / right.x, left.y / right.y, left.z / right.z);
    }

    public static Vec3 mul(Vec3 vector, double k) {
        return new Vec3(vector.x * k, vector.y * k, vector.z * k);
    }

    public static Vec3 div(Vec3 vector, double k) {
        return mul(vector, 1/k);
    }

    public static double dot(Vec3 left, Vec3 right) {
        return left.x * right.x + left.y * right.y + left.z * right.z;
    }

    public static Vec3 cross(Vec3 left, Vec3 right) {
        return new Vec3(left.y * right.z - left.z * right.y, -(left.x * right.z - left.z * right.x), left.x * right.y - left.y * right.x);
    }

    public static Vec3 unit(Vec3 vector) {
        return new Vec3(vector.x / vector.length(), vector.y / vector.length(), vector.z / vector.length());
    }

    @Override
    public String toString() {
        return x + " " + y + " " + z;
    }
}
