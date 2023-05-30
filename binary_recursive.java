import java.util.Scanner;

class binary_recursive {
    private static void LinearSearch(int[] arr, int item) {

    for(int i=0; i<arr.length; i++) {
        if(arr[i] == item) {
            System.out.println(item + " Found at index: " + i);
            return;
        }
    }
        System.out.println("Not found");
   }

    public static void main(String[] args) {
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

         LinearSearch(arr, item);
    }
}