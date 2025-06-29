package Module5;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(19,99,129));
    }
    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public static boolean isTeen(int a) {
        if(a >= 13 && a <= 19){
            return true;
        }
        return false;
    }
}
