package week_12.Array;

public class RunArrayApp {

    public static void main(String[] args) {

        // Creating objects
        int[] numbers = { 10,20, 50, 900, 1, 3, 5 };
        int [][] twoDiNumbers = {
                {10, 30, 40},
                {5, 6}
        };
        int[][] matrixOne = {
                { 10, 20 },
                { 50, 90 },
        };
        int[][] matrixTwo = {
                { 0, 3 },
                { 2, 1 }
        };
        // 0, 60
        // 100, 90
        var config = new ArrayConfig(numbers);
        var twoDimensionConfig = new ArrayConfig( twoDiNumbers );
        var matrixConfig = new ArrayConfig( matrixOne, matrixTwo );

        // Print the elements of one dimension array
        config.printIntElementsOfOneDimensionArray();
        config.printMaximumNumberFoundInOneDimensionArray();
        config.printMinimumNumberFoundInOneDimensionArray();

        System.out.println("Original Array:");
        config.printIntElementsOfOneDimensionArray();
        System.out.println("Sorted Array:");
        config.printIntElementsOfOneDimensionArray();

        config.printSecondSmallestNumberInOneDimensionArray();
        config.printSecondLargestNumberInOneDimensionArray();

        // print the elements of two dimension array
        twoDimensionConfig.printIntElementsOfTwoDimensionArray();

        // Print the result of the matrix
        matrixConfig.printElementsOfResultMatrix();

    }
}
