package Module6;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigSum(252));
    }

    public static int getEvenDigSum(int number) {
        if(number < 0 ){
            return -1;
        }
        int evenSum = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            if(lastDigit % 2 == 0){
                evenSum = evenSum + lastDigit;

            }
            number /= 10;
        }
        return evenSum;
    }
}
