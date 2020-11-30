package floatingpoint;
import java.util.Arrays;
import java.util.Random;

public class ArrayTotal {

    public static double[] createList(int n) {

        Random r = new Random();
        double[] list = new double[n];
        list[0] = 1;// first element is 1
		// followed by a bunch of small numbers
        for (int i = 1; i < n; i++) {
            list[i] = r.nextDouble() * 1.0e-18;
        }
        return list;
    }

    public static double sum1(double[] list) {

        double answer = 0.0;
        for (int i = 0; i < list.length; i++) {
            answer += list[i];
        }

        return answer;
    }

    public static double sum2(double[] list) {

        Arrays.sort(list);
        double answer = 0.0;
        for (int i = 0; i < list.length; i++) {
            answer += list[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        double[] list = createList(1000000);
        double v1 = sum1(list);
        double v2 = sum2(list);
        System.out.println(v1 + " vs " + v2);
    }
}
