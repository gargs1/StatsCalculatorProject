import java.util.Arrays;
public class StatsCalculator {
    private double[] values;
    private double[] sortedValues;

    public StatsCalculator() {
        values = new double[20];
    }
    public StatsCalculator(double[] param) {
        values = param;
    }

    public void sortData() {
        Arrays.sort(values);
    }
    public double calculateMin() {
        double min = values[0];
        for(int i = 0; i < values.length; i++) {
                if(values[i] < min) {
                    min = values[i];
                }
            }
            return min;

        }
    public double calculateMax() {
        double max = values[0];
        for(int y = 0; y < values.length; y++) {
            if(values[y] > max) {
                max = values[y];
            }
        }
        return max;
    }
    public double calculateFirstQuartile() {
        double firstQ = 0;
        if((values.length) % 4 == 0) {
            firstQ = (values[values.length / 4] + values[values.length / 4 + 1]) /2;
        }
        else {
            firstQ = (values[values.length / 4])

        }
        return firstQ;
    }

   // public double calculateThirdQuartile() {
  //  }

    public double calculateMedian() {
        double median = 0;
        if(values.length % 2 <= 1) {
            median = (values[values.length / 2] + values[values. length / 2 - 1]);
        }
        else {
            median = values[values.length / 2];
            }
        return median;
        }

        public double calculateMean() {
        double mean = 0;
        for (int a = 0; a < values.length; a++) {
            mean += values[a];
        }
          mean /= values.length;
          return mean;
            }

        public double calculate
        public void printFiveNumberSummary() {
        }
}
