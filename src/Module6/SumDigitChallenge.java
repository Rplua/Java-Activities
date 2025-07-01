package Module6;

public class SumDigitChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigitsWhile(125));
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        String numberStr = String.valueOf(number);

        for (int i = 0; i < numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            sum += digit;
            System.out.println("Dígito: " + digit);
        }

        return sum;
    }


    public static int sumDigitsWhile(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 9) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
            System.out.println(number);
        }

        return sum;
    }
}
