package Module5;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(5.0,4));
    }


    public static double area(double radisu){
        if(radisu < 0){
            return -1;
        }
        return Math.pow(radisu,2) * Math.PI ;
    }
    public static double area(double x, double y){
        if(x < 0 || y < 0){
            return -1;
        }
        return x*y;
    }
}
