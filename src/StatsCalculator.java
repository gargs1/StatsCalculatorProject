import java.util.Arrays;
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
     *
     * @param list is the values in the array
     */
  public StatsCalculator(double[] list) {
    values = param;
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
     *
     *
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
     *
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
     *
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
     *
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
         *
         */
        public double calculateSum() {
        double sum = 0;
        for(int i = 0; i < sortedValues.length; i++) {
            sum += sortedValues[i];
        }
        return sum;
        }

        /**
         *
         */
        public void print() {
            System.out.println("Your data is: ");
            for(double z: values) {
            System.out.println(z + " ");
            }

        }

        /**
         *
         */
        public void printSorted() {
            System.out.println("Your sorted data is: ");
            for (double i : sortedValues) {
                System.out.println(i + " ") ;
            }
        }
        public void printFiveNumberSummary() {
            System.out.println("The five number summary is:");
            System.out.println("Minimum: " + calculateMin());
            System.out.println("First Quartile: " + calculateFirstQuartile());
            System.out.println("Median: " + calculateMedian());
            System.out.println("Third Quartile: " + calculateThirdQuartile());
            System.out.println("Maximum: " + calculateMax());

        }
}
