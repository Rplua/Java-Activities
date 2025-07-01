package Module6;

public class isEven {
    public static void main(String[] args) {

        int number = 4;
        int countEven = 0;
        int countOdd = 0;
        while( number <= 20 ) {
            number++;
            if (isEvenNumber(number) ) {
                System.out.println("is Even Number " +number);
                countEven++;
            }
            if (!isEvenNumber(number)) {
                countOdd++;
            }
            if (countEven == 5 || countOdd == 5) {
                System.out.println(countEven + " Numero even "+ " numeros odd " +  countOdd);
                break;
            }

        }
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
