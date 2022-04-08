package MinandMax;

public class MinMaxFinder {
    public int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];

        }
        return new int[]{min, max};
    }

    public String findMinMax2(int[] arr) {
        int min = arr[0];
        int max = arr[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];

        }
        return "Min = " + min + ", Max = " + max;
    }
}
