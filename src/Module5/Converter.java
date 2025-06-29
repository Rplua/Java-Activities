package Module5;

public class Converter {
    public static void main(String[] args) {
            System.out.println(convertToCenterimeteres(5,8));
        System.out.println(convertToCenterimeteres(6));
    }

    public static double convertToCenterimeteres(int a){
        return a * 2.54;
    };

    public static double convertToCenterimeteres(int a, int b){
        int value = a * 12;
        int total = value + b;

        return convertToCenterimeteres(total);
    };
}
