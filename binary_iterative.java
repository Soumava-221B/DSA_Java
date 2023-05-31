import java.util.Scanner;

public class binary_iterative{

    public static int binarySearch(int arr[], int left, int right, int item){

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // if item is at mid
            if (arr[mid] == item)
                return mid;

            // If item greater, ignore left half, consider only right half
            if (arr[mid] < item)
                left = mid + 1;

                // If item is smaller, ignore right half, consider only left half
            else
                right = mid - 1;
    }
           // if we are able to reach here
           // means item wasn't present
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