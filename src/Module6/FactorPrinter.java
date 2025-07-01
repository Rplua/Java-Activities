package Module6;

public class FactorPrinter {
    public static void main(String[] args) {
        printFactor(6);
    }

    public static void printFactor(int number){
        if(number < 1){
            System.out.println("Invalid Value");
            return;
        }
        int num = 1;
        while(num <= number){
            if(number % num == 0){
                System.out.println(num);
            }
            num ++;
        }

    }
}
