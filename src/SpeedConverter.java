public class SpeedConverter {
    public static void main(String[] args) {

        System.out.println(toMilesPerHour(15.25));
        System.out.println(toMilesPerHour(2.5));
        printConversion(2.0);
        printConversion(0);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");

    }

}
