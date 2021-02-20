package com.company.rough;
import java.util.List;
import java.util.ArrayList;

public class Rough14 {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        List<Boolean> output = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                output.add(true);
            } else {
                output.add(false);
            }
        }
        return output;
    }
}
