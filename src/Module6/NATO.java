package Module6;

public class NATO {
    public static void main(String[] args) {
        char  Letter = 'A';

        switch (Letter) {
            case 'A' :
                System.out.println("Able");
                break;
            case 'B' :
                System.out.println("Baker");
                break;

            case 'C' :
                System.out.println("Charlie");
                break;

            case 'D' :
                System.out.println("Dog");
                break;
            case 'E' :
                System.out.println("Easy");
                break;

            default:
                System.out.println("Unknown");
        }

        printDayOfWeek(1);
    }


    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day){
            case 0 -> "Sunday";
            case 1 ->  "Monday";
            case 2 ->  "Tuesday";
            case 3 ->  "Wednesday";
            case 4 ->  "Thursday";
            case 5 ->  "Friday";
            case 6 ->  "Saturday";
            default ->  "Unknown";
        };

        System.out.println(day + " Stand for " + dayOfWeek);
    }


}
