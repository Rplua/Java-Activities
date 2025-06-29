public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(PlayingCat.isCatPlaying(true, 10));   // false
        System.out.println(PlayingCat.isCatPlaying(false, 36));  // false
        System.out.println(PlayingCat.isCatPlaying(false, 35));  // true

    }

    public static  boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = summer ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimit;
    }

}
