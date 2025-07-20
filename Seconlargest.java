
public class Seconlargest {

// Source code is decompiled from a .class fi
    public static void main(String[] args) {
        int[] a = new int[]{5, 4, 3, 9, 2, 8};
        //int min = a[1];
        int max = 0;
        int secondlar = a[0];

        for (int i = 0; i < a.length; ++i) {

            if (max < a[i]) {
                max = a[i];
            } else {
                if (a[i] != max && a[i] > secondlar) {
                    secondlar = a[i];
                }
            }
        }

        System.out.println(max + " " + secondlar);
    }
}
