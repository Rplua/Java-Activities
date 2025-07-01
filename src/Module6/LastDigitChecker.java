package Module6;

public class LastDigitChecker {
    public static void main(String [] args){
            System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
    }
    public static boolean hasSameLastDigit(int a, int b, int c ) {
        if(!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        int LastDigitA = a % 10;
        int LastDigitB = b % 10;
        int LastDigitC = c % 10;


        if (LastDigitA == LastDigitB || LastDigitA == LastDigitC || LastDigitB == LastDigitC) {
            return true;
        }


        return false;

    }

    public static boolean isValid(int a){
        if( a < 10 || a > 1000){
            return false;
        }
        return true;
    };
}
