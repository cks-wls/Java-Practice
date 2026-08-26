package basic.staticex;

public class MathArrayUtils {
    private MathArrayUtils() {
        //인스턴스를 생성하지 못하게 생성자를 private로 생성하기

    }

    public static int sum(int[] arr) {
        int totalSum = 0;
        for (int i : arr) {
            totalSum += i;
        }
        return totalSum;
    }

    public static double average(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int min(int[] arr) {
        int minNumber = arr[0];
        for (int i : arr) {
            if (minNumber > i) {
                minNumber = i;
            }
        }
        return minNumber;
    }

    public static int max(int[] arr) {
        int maxNumber = arr[0];
        for (int i : arr) {
            if (maxNumber < i) {
                maxNumber = i;
            }
        }
        return maxNumber;
    }
}
