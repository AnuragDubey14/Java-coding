public class BinarySearch {
    public static int binary_search(int[] arr, int item) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (item == arr[mid]) {
                return mid;
            } else if (item<arr[mid]) {
            right=mid;
            } else if (item>arr[mid]) {
                left=mid;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int []arr={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int item=30;
        int res=binary_search(arr,item);
        System.out.printf("%d found at - %d",item,res);
        }
    }

