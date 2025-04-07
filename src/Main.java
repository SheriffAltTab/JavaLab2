public class Main {
    public static void main(String[] args) {
        double xStart = 2.0;
        double xEnd = 5.0;
        double step = 0.005;

        Tabulation tabulation = new Tabulation(xStart, xEnd, step);

        System.out.println("Табулювання виконано. Загальна кількість точок: " + tabulation.getSize());

        int minIndex = tabulation.findMinIndex();
        int maxIndex = tabulation.findMaxIndex();

        System.out.printf("Мінімальне значення y = %.5f при x = %.5f (індекс %d)\n",
                tabulation.getY(minIndex), tabulation.getX(minIndex), minIndex);
        System.out.printf("Максимальне значення y = %.5f при x = %.5f (індекс %d)\n",
                tabulation.getY(maxIndex), tabulation.getX(maxIndex), maxIndex);

        System.out.printf("Сума всіх значень y: %.5f\n", tabulation.sumYValues());
        System.out.printf("Середнє значення y: %.5f\n", tabulation.averageYValue());
    }
}