
public class MinMax {

    public static void main(String[] args) {

        int[] a = {5, 4, 3, 9, 2, 8};
        int min = a[1];
        int max = 0;
        int secondlargest = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];

            }
            if (max < a[i]) {
                max = a[i];
            }

        }
        System.out.println(min + " " + max);

    }

}
