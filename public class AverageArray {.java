public class AverageArray {
  public static void main(String[] args) {
    // Create an array of 15 numbers
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
// Calculate the sum of all numbers in the array
    int sum = 0;
    for (int number : numbers) {
      sum+= number;
    }
// Calculate the average
    double average = (double) sum / numbers.length;
 // Print the average
    System.out.println("The average of the numbers is: " + average);
  }
}