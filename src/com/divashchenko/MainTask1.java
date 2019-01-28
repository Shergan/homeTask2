package com.divashchenko;

public class MainTask1 {

    public static void main(String[] args) {
        String jewels = "aAb";
        String stones = "cacAcA";

        System.out.println("Jewels: " + howMuchAreJewelsInStones(jewels, stones));
    }

    private static int howMuchAreJewelsInStones(String jewels, String stones) {
        String[] tmpJewels = jewels.split("");
        String[] tmpStones = stones.split("");
        int count = 0;

        for (String tmpJewel : tmpJewels) {
            for (String tmpStone : tmpStones) {
                if (tmpJewel.equals(tmpStone)) {
                    count++;
                }
            }
        }
        return count;
    }
}
