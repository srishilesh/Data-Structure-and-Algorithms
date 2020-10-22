// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int[] A = {31, 41, 59, 26, 41, 58};
        A = sortAscending(A);
        print(A);
        A = sortDescending(A);
        print(A);
    }
    public static void print(int[] arr) {
        for (int val : arr)
            System.out.print(val + " ");
        System.out.println();
    }
    public static int[] sortAscending(int[] A) {
        for (int i = 1; i < A.length; i ++) {
            int key = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = key;
        }
        return A;
    }
    public static int[] sortDescending(int[] A) {
         for (int i = 1; i < A.length; i ++) {
            int key = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] < key) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = key;
        }
        return A;
    }
}
