public class FunctionCalculator {
    public static double calculate(double x) {
        if (x > 3.4) {
            return Math.sin(x) * Math.log10(x);
        } else {
            return Math.pow(Math.cos(x), 2);
        }
    }
}