import java.util.Scanner;

class Bubble_sort {
    static void bubbleSort(int a[]) {
        int len = a.length;
        for (int i = 0; i < len-1; i++) {
            boolean swapped = false;
            for (int j=0; j < len-i-1; j++) {
                if (a[j] > a[j+1]) 
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    
                    swapped = true;
                }
            }

            if (swapped == false)
                break;
        }
    }

    static void printArray(int a[])
    {
        int len = a.length;
        for (int i=0; i<len; i++) 
            System.out.print(a[i]+" ");

        System.out.println();
    }

    public static void main(String args[]) {
        
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
        bubbleSort(arr);
        System.out.println("Sorted array");
        printArray(arr); 
    }
}