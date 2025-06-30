package Module6;

public class Sum3And5Challenge {
    public static void main(String [] args){
        System.out.println(sum3And5(80));
    }

    public static int sum3And5(int number){
        if(number < 1 || number > 1000){
            return -1;
        }
        int sum = 0;
        for (int i = 1; i <= number; i++){
            if(sum == 5){
                break;
            }

            if (i % 5 == 0 && i%3 == 0){
                System.out.println( i + " This number is divisible by 5 and 3");
                sum ++;
            }


        }
        return sum;

    }
}
