import java.util.Arrays;

/**
 * This class performs different calculation
 * in relation to statistics like a calculator
 * would automate its math
 */
public class StatsCalculator {

  private double[] values;
  private double[] sortedValues;

    /**
     *Makes a default array of 20 values that are set to 0
     *
     */
  public StatsCalculator() {
    values = new double[20];
    }

    /**
     *Constructs a stats calculator
     *
     * @param list is the values in the array
     */
  public StatsCalculator(double[] list) {
    values = list;
    }

    /**
     *Assigns values array to a new variable called sortedValues
     *Sorts the numbers of the array values into ascending order.
     *
     */
  public void sortData() {
      sortedValues = values;
    Arrays.sort(sortedValues);
  }

    /**
     *Finds the minimum value in the array
     *
     * @return min value of the array
     */
  public double calculateMin() {
    double min = values[0];
      for(int i = 0; i < values.length; i++) {
        if(values[i] < min) {
          min = values[i];
                }
            }
            return min;

        }
    /**
     *Finds the maximum value in the array
     *
     * @return max value of the array
     */
    public double calculateMax() {
        double max = values[0];
        for(int y = 0; y < values.length; y++) {
            if(values[y] > max) {
                max = values[y];
            }
        }
        return max;
    }
    /**
     *Finds or calculates the first quartile value in the array
     *
     * @return firstQuartile of the array
     */
    public double calculateFirstQuartile() {
        double firstQ = 0;
        if((sortedValues.length) % 4 <= 1) {
            firstQ = (sortedValues[((sortedValues.length) / 4)] + sortedValues[(sortedValues.length) / 4 - 1]) /2;
        }
        else {
            firstQ = (sortedValues[sortedValues.length / 4]);

        }
        return firstQ;
    }
    /**
     *Finds or calculates the third quartile value in the array
     *
     * @return thirdQuartile of the array
     */
    public double calculateThirdQuartile() {
   double thirdQ = 0;
        if((sortedValues.length) % 4 <= 1) {
        thirdQ = (sortedValues[((sortedValues.length) * 3 / 4)] + sortedValues[(sortedValues.length) * 3 / 4 - 1]) /2;
        }
        else {
        thirdQ = (sortedValues[sortedValues.length * 3 / 4]);

    }
        return thirdQ;
}
    /**
     *Calculate the median by finding the middle index or
     * finding the average between the two middle indexes
     * values stored.
     *
     * @return median
     */
    public double calculateMedian() {
        double median = 0;
        if(sortedValues.length % 2 == 0) {
            median = (sortedValues[sortedValues.length / 2] + sortedValues[sortedValues. length / 2 - 1])/2;
        }
        else {
            median = sortedValues[sortedValues.length / 2];
            }
        return median;
        }

    /**
     *Calculates the average number value within the
     *  values array
     *
     * @return mean which is the average
     */
        public double calculateMean() {
        double mean = 0;
        for (int a = 0; a < sortedValues.length; a++) {
            mean += sortedValues[a];
        }
          mean /= sortedValues.length;
          return mean;
            }

        /**
         *Calculate the sum of the values in the array
         *
         * @return sum of values in the area
         */
        public double calculateSum() {
        double sum = 0;
        for(int i = 0; i < sortedValues.length; i++) {
            sum += sortedValues[i];
        }
        return sum;
        }

        /**
         *Runs through a for loop and prints out
         * every value in the values array with a space in between
         * each person.
         *
         *
         */
        public void print() {
            System.out.println("Your data is: ");
            for(double z: values) {
            System.out.println(z + " ");
            }

        }

        /**
         *Goes through a for loop and prints out every value in
         * the sorted values array with a space in between
         *
         *
         */
        public void printSorted() {
            System.out.println("Your sorted data is: ");
            for (double i : sortedValues) {
                System.out.println(i + " ") ;
            }
        }

    /**
     *Prints out all 5 metrics the calculator is intended to
     *calculate. Make a call to every method and be given a subheading
     * for each metric.
     *
     */
        public void printFiveNumberSummary() {
            System.out.println("The five number summary is:");
            System.out.println("Minimum: " + calculateMin());
            System.out.println("First Quartile: " + calculateFirstQuartile());
            System.out.println("Median: " + calculateMedian());
            System.out.println("Third Quartile: " + calculateThirdQuartile());
            System.out.println("Maximum: " + calculateMax());

        }
}
