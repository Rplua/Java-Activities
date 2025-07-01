package Module6;

public class NumberPalidrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = Math.abs(number);
        int reversed = 0;
        int temp = originalNumber;
        while (temp > 0) {
            reversed = reversed * 10;
            reversed = reversed + temp % 10;
            temp = temp / 10;
        }
        if (reversed == originalNumber) {
            return true;
        }
        return false;
    }
}
