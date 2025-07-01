package Module6;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(12,90));
        System.out.println(hasSharedDigit(9,9));
    }

    public static boolean hasSharedDigit(int a, int b) {
        if ( a > 99  || a < 10 ||  b > 99  || b < 10  ) {
            return false;
        }

        int lastValueA = a % 10;
        int lastValueB = b % 10;
        int firstValueA = a / 10;
        int firstValueB = b / 10;

        if (lastValueA == lastValueB) {
            return true;
        }if (firstValueA == firstValueB) {
            return true;
        }
        if (firstValueA == lastValueB) {
            return true;
        }
        if (lastValueA == firstValueB) {
            return true;
        }
        return false;
    }
}
