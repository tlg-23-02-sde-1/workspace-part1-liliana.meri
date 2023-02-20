package gov.research;

import java.util.Arrays;

class ArraysTest {

    public static void main(String[] args) {
        int[] ages = new int[2];
        ages[0] = 56;
        ages[1] = 49;
        System.out.println(ages); // toString(); NOT USEFUL
        System.out.println(Arrays.toString(ages)); // GOOD
        System.out.println();

        double[] prices = {9.99, 37.49, 32.5, 49.96}; // 0-3 indexes
        System.out.println("prices has length: " + prices.length);
        System.out.println(Arrays.toString(prices));
        System.out.println();

        String[] names = {"lily", "mileah"};
        System.out.println(Arrays.toString(names));
    }
}