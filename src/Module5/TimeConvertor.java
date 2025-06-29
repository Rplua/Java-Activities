package Module5;

public class TimeConvertor {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));   // 01h 05m 45s
        System.out.println(getDurationString(65, 4));  // 01h 05m 04s
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Seconds should be >= 0";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid duration";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return String.format("%02dh %02dm %02ds", hours, remainingMinutes, seconds);
    }
}
