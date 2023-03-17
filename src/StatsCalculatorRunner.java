public class StatsCalculatorRunner {
    public static void main(String[] args) {

    double[ ] data = {30, 31, 32, 33, 34, 35, 36, 37, 38, 39};

    //create a StatsCalculator object
        StatsCalculator myCalculator = new StatsCalculator(data);
        myCalculator.print();
        myCalculator.sortData();
        myCalculator.printSorted();
        myCalculator.printFiveNumberSummary();
        System.out.println("\nThe mean is " + myCalculator.calculateMean());



}
}
