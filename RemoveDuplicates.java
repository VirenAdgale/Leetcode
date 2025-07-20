
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 9, 10, 7, 20, 10};
        int n = arr.length;

        int[] temp = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // check if arr[i] already exists in temp
            for (int j = 0; j < k; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // if not found, add to temp
            if (!isDuplicate) {
                temp[k++] = arr[i];
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < k; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
