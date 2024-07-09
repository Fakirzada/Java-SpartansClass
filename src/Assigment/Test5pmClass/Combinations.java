package Assigment.Test5pmClass;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static void main(String[] args) {
        int n = 50; // range of numbers (1 to 50)
        int k = 4; // number of elements in each combination

        // List to store the result
        List<List<Integer>> result = new ArrayList<>();

        // List to store the current combination
        List<Integer> combination = new ArrayList<>();

        // Generate combinations
        generateCombinations(1, n, k, combination, result);

        // Print all combinations
        for (List<Integer> comb : result) {
            System.out.println(comb);
        }

        // Optionally, print the number of combinations
        System.out.println("Total combinations: " + result.size());
    }

    private static void generateCombinations(int start, int n, int k, List<Integer> combination, List<List<Integer>> result) {
        // If the combination is of the desired length, add it to the result list
        if (combination.size() == k) {
            result.add(new ArrayList<>(combination));
            return;
        }

        // Iterate over the range of numbers
        for (int i = start; i <= n; i++) {
            // Add the current number to the combination
            combination.add(i);

            // Recur with the next number
            generateCombinations(i + 1, n, k, combination, result);

            // Backtrack to remove the last added number
            combination.remove(combination.size() - 1);
        }
    }
}
