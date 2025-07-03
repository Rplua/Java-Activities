package Module6;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        // Máximo número de sacos grandes que podemos usar sin pasarnos del goal
        int maxBigBagsWeCanUse = Math.min(goal / 5, bigCount);

        // Restamos los kilos que aportan los big bags y vemos si podemos completar con los small bags
        int remainingWeight = goal - (maxBigBagsWeCanUse * 5);

        return smallCount >= remainingWeight;
    }
}
