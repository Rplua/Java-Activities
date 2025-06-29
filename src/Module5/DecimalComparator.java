package Module5;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.176, 3.175));
    }
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        long firstRounded = (long) (a * 1000);
        long secondRounded = (long) (b * 1000);
        return firstRounded == secondRounded;
    }
}
