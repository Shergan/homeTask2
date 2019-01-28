package com.divashchenko;

public class MainTask3 {

    public static void main(String[] args) {
        String str = "#1AamCZz";
        System.out.println("Input: " + str);
        System.out.println();
        System.out.println("Output: " + toLowerCase(str));
    }

    private static String toLowerCase (String str) {
        StringBuilder tmpStringBuilder = new StringBuilder();
        int periodInUnicode = 32;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                tmpStringBuilder.append((char)(str.charAt(i) + periodInUnicode));
            } else {
                tmpStringBuilder.append(str.charAt(i));
            }
        }
        return tmpStringBuilder.toString();
    }
}