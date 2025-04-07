public class Tabulation {
    private double[] xValues;
    private double[] yValues;

    public Tabulation(double xStart, double xEnd, double step) {
        int size = (int) ((xEnd - xStart) / step) + 1;
        xValues = new double[size];
        yValues = new double[size];

        for (int i = 0; i < size; i++) {
            xValues[i] = xStart + i * step;
            yValues[i] = FunctionCalculator.calculate(xValues[i]);
        }
    }

    public double getX(int index) {
        return xValues[index];
    }

    public double getY(int index) {
        return yValues[index];
    }

    public int getSize() {
        return xValues.length;
    }

    public int findMinIndex() {
        int minIndex = 0;
        for (int i = 1; i < yValues.length; i++) {
            if (yValues[i] < yValues[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public int findMaxIndex() {
        int maxIndex = 0;
        for (int i = 1; i < yValues.length; i++) {
            if (yValues[i] > yValues[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public double sumYValues() {
        double sum = 0;
        for (double y : yValues) {
            sum += y;
        }
        return sum;
    }

    public double averageYValue() {
        return sumYValues() / yValues.length;
    }
}