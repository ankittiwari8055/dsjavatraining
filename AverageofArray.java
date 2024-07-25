public class AverageofArray {
    public static void main(String[] args) {
        int numbers[] = {1, 7, 9, 11, 12};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        int avg = (sum/ numbers.length);8
        System.out.println(avg);
    }
}