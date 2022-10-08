public class Main {
    public static void main(String[] args) {
        double[] numbers1 = {1.2, -3.5, 2.2, -15.6, -6.7, 6.6, -3.3, 4.5, -12.1, -23.4, 5.6, -3.8, -5.9, 4.7, -8.8};
        double average = 0.0;
        int count = 0;
        boolean d = false;
        for (double numbers : numbers1) {
            if (numbers < 0) {
                d = true;
            } else if (d){
                count++;
                average += numbers;
            }
        }
        System.out.println(average / count);

    }
    }
