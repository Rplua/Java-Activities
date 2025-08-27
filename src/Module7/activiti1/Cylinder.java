package Module7.activiti1;

public class Cylinder  extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            this.height = 0;
            return;
        }
        this.height = height;
    }

    public double getVolume() {
        return getRadius() * height;
    }

}
