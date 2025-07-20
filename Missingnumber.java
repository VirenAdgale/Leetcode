
public class Missingnumber {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 6, 7, 8};
        int n = 8;
        int sum = n * (n + 1) / 2;
        int s = 0;
        for (int i = 0; i < a.length; i++) {

            s += a[i];
        }

        int w = sum - s;
        System.out.println("Missimg value" + w);

    }

}
