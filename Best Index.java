import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static int[] getArray() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static long solve(int[] arr) {
        int n = arr.length;
        long result = arr[n - 1];
        long sum = 0, incomplete = 0;
        int j = n - 1;
        int k = n - 3; // Index at which a chunk can be added to the sum
        for (int i = n - 1; i >= 0; i--) {
            sum += arr[i];
            result = Math.max(result, sum);
            sum -= arr[j];
            incomplete += arr[j];
            j--;
            if (j == k) {
                k--;
                sum += incomplete;
                incomplete = 0;
                j = n - 1;
            }
        }
        return result;
    }

    public static void main(String args[] ) throws Exception {
        System.out.println(solve(getArray()));
    }
}