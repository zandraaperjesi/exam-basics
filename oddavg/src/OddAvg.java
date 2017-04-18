import java.util.List;

public class OddAvg {
  public static void main(String[] args) {
    // Create a function called `oddAverage` that takes a list of numbers as parameter
    // and returns the average value of the odd numbers in the list
    // Create basic unit tests for it with at least 3 different test cases
  }

  public double oddAverage (List<Double> averageOf) {
    int counter = 0;
    double sum = 0;
    for (double num : averageOf) {
      if (num % 2 == 1) {
        counter += 1;
        sum += num;
      }
    }
    return sum / counter;
  }
}
