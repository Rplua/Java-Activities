package Module7.activiti1;

public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            this.radius = 0;
            return;
        }
        this.radius = radius;

    }

    public double  getArea(){
        return radius * radius * Math.PI;
    }
}
