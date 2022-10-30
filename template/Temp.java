import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.StringTokenizer;

public class Temp {
    public static void main(String[] args) {
        CustomScanner scanner = new CustomScanner();
        int testCases = scanner.nextInt();
        for (int testCase = 0; testCase < testCases; testCase++) {
            // TODO: code here.
        }
    }

    static final Random RANDOM = new Random();
    static final int MOD = 1_000_000_007;

    static void ruffleSort(int[] array) {
        for (int index = 0; index < array.length; index++) {
            int randomIndex = RANDOM.nextInt(array.length), temp = array[randomIndex];
            array[randomIndex] = array[index];
            array[index] = temp;
        }
        Arrays.sort(array);
    }

    static long add(long first, long second) {
        return (first + second) % MOD;
    }

    static long sub(long first, long second) {
        return ((first - second) % MOD + MOD) % MOD;
    }

    static long mul(long first, long second) {
        return (first * second) % MOD;
    }

    static long exp(long base, long exp) {
        if (exp == 0)
            return 1;
        long half = exp(base, exp / 2);
        if (exp % 2 == 0)
            return mul(half, half);
        return mul(half, mul(half, base));
    }

    static long[] factorials = new long[2_000_001];
    static long[] invFactorials = new long[2_000_001];

    static void precompFacts() {
        factorials[0] = invFactorials[0] = 1;
        for (int i = 1; i < factorials.length; i++)
            factorials[i] = mul(factorials[i - 1], i);
        invFactorials[factorials.length - 1] = exp(factorials[factorials.length - 1], MOD - 2);
        for (int i = invFactorials.length - 2; i >= 0; i--)
            invFactorials[i] = mul(invFactorials[i + 1], i + 1);
    }

    static long nCk(int n, int k) {
        return mul(factorials[n], mul(invFactorials[k], invFactorials[n - k]));
    }

    static void sort(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : array)
            arrayList.add(i);
        Collections.sort(arrayList);
        for (int i = 0; i < array.length; i++)
            array[i] = arrayList.get(i);
    }

    static class CustomScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        float nextFloat() {
            return Float.parseFloat(next());
        }

        int[] readArray(int size) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++)
                array[i] = nextInt();
            return array;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}