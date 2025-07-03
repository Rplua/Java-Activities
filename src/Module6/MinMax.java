package Module6;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int loopCount = 0;
        double max = 0;
        double min = 0;

        while (true) {
            System.out.println("Enter number");
            String nextEntry = in.nextLine();
            try {
                double validNumber = Double.parseDouble(nextEntry);
                if(loopCount == 0  || validNumber <= min) {
                    min = validNumber;
                }
                if(loopCount == 0 || validNumber > max) {
                    max = validNumber;
                }
                loopCount++;
            }catch (NumberFormatException e) {
                break;
            }
        }
        if (loopCount > 0) {
            System.out.println("min  = " + min +  " max  = " + max );
        }else {
            System.out.println("Invalid Value");
        }
    }
}
