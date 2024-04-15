public class Main {
    public static void main(String[] args) {
        double[] numbers = {8, 4, -9, -22, 2, 3, 6, -7, 5, 13, -3, 2, -1, 8, -11};

        boolean foundNegative = false;
        double sum = 0;
        int count = 0;

        for (double number : numbers) {
            if (number < 0) {
                foundNegative = true;
            } else if (foundNegative && number > 0) {
                sum += number;
                count++;
            }

        }
        System.out.println(count / sum);
    }
}