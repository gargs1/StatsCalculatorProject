public class StatsCalculatorRunner {
    double[ ] data = {1,2,3,4,5,6};

    //create a StatsCalculator object
    StatsCalculator myCalculator = new StatsCalculator(data);

    double firstQuartile = myCalculator.calculateFirstQuartile();

}
