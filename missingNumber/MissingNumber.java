package missingNumber;

public class MissingNumber {

    public static int findMissingNumber(int[] array) {
        // return 6;

        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        int len = array.length + 1;
        int expected = len * (len + 1) / 2;

        return expected - sum;

    }

}
