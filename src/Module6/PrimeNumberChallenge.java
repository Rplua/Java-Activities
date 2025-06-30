package Module6;

public class PrimeNumberChallenge {
    public static  void main(String[] args) {
        System.out.println(isPrime(17));

        System.out.println(getNumberOfPrimes(100));
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return number == 2;
        }
        for(int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static int getNumberOfPrimes(int number){
        if(number <0 || number > 1000){
            return -1;
        }
        int count = 0;
        for(int i = 2; i <= number; i++){
            if(isPrime(i)){
                System.out.println("This number is prime " + i);
                count++;
            }
            if(count == 3){
                break;
            }
        }
        return count;
    }
}
