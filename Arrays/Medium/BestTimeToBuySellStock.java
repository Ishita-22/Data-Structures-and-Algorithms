/**
 * Problem Name: Best Time to Buy and Sell Stock
 * Difficulty: Medium
 *
 * Problem Statement:
 * Given an array prices where prices[i] is the price of a stock on the ith day,
 * find the maximum profit by buying and selling once.
 *
 * Pseudocode:
 * 1. Initialize minPrice = infinity, maxProfit = 0
 * 2. Traverse prices:
 *    - Update minPrice
 *    - Calculate profit = price - minPrice
 *    - Update maxProfit
 *
 * Approach:
 * Track minimum buying price so far and compute profit dynamically.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [7,1,5,3,6,4]
 * Output: 5
 */

public class BestTimeToBuySellStock {

    public static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices) {
            if(price < minPrice)
                minPrice = price;
            else
                maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
