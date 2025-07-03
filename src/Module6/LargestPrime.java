package Module6;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        // Dividimos por todos los factores primos posibles empezando por 2
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                number /= i;

                // Si number ahora es 1, entonces i es el mayor primo que lo dividió
                if (number == 1) {
                    return i;
                }
            }
        }

        return -1;
    }
}
