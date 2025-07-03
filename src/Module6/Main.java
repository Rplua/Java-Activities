package Module6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;
        try {
            System.out.println(getInputFromConsole(currentYear));

        }catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, what's your name?");
        System.out.println("Hi " +name);
        String date = System.console().readLine("Date");
        System.out.println("How old are you?" + date);

        return "So" + date;
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, what's your name?" );
        String name = scanner.nextLine();
        System.out.println("hi" + name + "Ty be here");

        System.out.println("What year you were born" + name);

        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125 ) + " and <= " + currentYear);
            try{
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            }catch (NumberFormatException e){
                System.out.println("not allow");
            }

        }
        while (!validDOB);


        return  "so you are " + age + " years old";
    }

    public static  int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;
        if (dob < minimumYear || dob > currentYear) {
            return -1;
        }
        return (currentYear - dob);
    }

}
