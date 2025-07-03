package Module6;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (row == 1 || row == number ||  // primera o última fila
                        col == 1 || col == number ||  // primera o última columna
                        row == col ||                 // diagonal principal
                        col == (number - row + 1)) {  // diagonal secundaria
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // salto de línea al final de cada fila
        }
    }
}
