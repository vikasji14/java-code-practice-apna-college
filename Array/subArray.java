package Array;

public class subArray {

    static void printSubArray(int arr[]) {
        int totalSubArray = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int subArraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + ", ");
                    subArraySum += arr[k];
                }
                System.out.println("=" + subArraySum);
                totalSubArray++;
                maxSum = Math.max(maxSum, subArraySum);
                minSum = Math.min(minSum, subArraySum);
                subArraySum = 0;
            }

        }

        System.out.println("Total Subarray : " + totalSubArray);
        System.out.println("Max Sum : " + maxSum);
        System.out.println("Min Sum : " + minSum);
    }

    public static void main(String[] args) {

        int arr[] = { 10, -4, 2, -40, 0 };
        printSubArray(arr);

    }
}