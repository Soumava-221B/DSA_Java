import java.util.Scanner;

public class binary_recursive{

    public static int binarySearch(int arr[], int left, int right, int item){

        if (right >= left){

            // calculation of new mid
            int mid = left + (right - left)/2;

            // returns position where found
            if (arr[mid] == item)
                return mid+1;

            // goes to recursive calls in left half
            if (arr[mid] > item)
                return binarySearch(arr, left, mid-1, item);

                // goes to recursive calls in right half
            else
                return binarySearch(arr, mid+1, right, item);
        }
        // if element is not found we return -1
        else
            return -1;
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

         System.out.print("Enter the size of the array: ");
         int arr_size = 0;
         if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
         }

         int[] arr = new int[arr_size];

         System.out.print("Enter the elements of the array: ");
         for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
         }

         System.out.print("Enter a number which you want to find in the array: ");
         int item = sc.nextInt();

        int position = binarySearch(arr, 0, arr_size-1, item);

        if(position == -1)
            System.out.println("Element not found");
        else
            System.out.println("The value " + item + " found at position: " + position);

    }
}