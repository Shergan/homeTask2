package com.divashchenko;

public class MainTask1 {

    public static void main(String[] args) {
        String jewels = "aAb";
        String stones = "cacAcA";

        System.out.println("Jewels: " + howMuchAreJewelsInStones(jewels, stones));
    }

    private static int howMuchAreJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
}
