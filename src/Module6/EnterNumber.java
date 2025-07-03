package Module6;

import java.util.Scanner;

public class EnterNumber {
    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while (counter <= 5) {
            System.out.println("Enter number# " + counter + ":");
            String nextNumber = in.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                counter++;
                sum += number;
            }catch (NumberFormatException e){
                System.out.println("not allow");
            }
        }
        System.out.println("sum = " + sum);

    }
}
