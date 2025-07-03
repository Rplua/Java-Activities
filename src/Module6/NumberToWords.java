package Module6;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);    // One Two Three
        numberToWords(1000);   // One Zero Zero Zero
        numberToWords(1010);   // One Zero One Zero
        numberToWords(-12);    // Invalid Value
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int reverse(int number) {
        int reversed = 0;
        int isNegative = number < 0 ? -1 : 1;
        number = Math.abs(number);

        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }

        return reversed * isNegative;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversed = reverse(number);
        int originalDigitCount = getDigitCount(number);


        for (int i = 0; i < originalDigitCount; i++) {
            int lastDigit = reversed % 10;
            switch (lastDigit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            reversed /= 10;
        }
    }
}