import java.util.Scanner;

class insertion_sort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter the size of the array: ");
         int arr_size = 0;
         if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
         }

         int[] a = new int[arr_size];

         System.out.print("Enter the elements of the array: ");
         for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                a[i] = sc.nextInt();
            }
         }

        System.out.println("Array Before Insertion Sort: ");
        printArray(a);

        insertionSort(a);

        System.out.println("Array After Insertion Sort: ");
        printArray(a);
    }

    static void insertionSort(int arr[])
    {
        int len = arr.length; 
        for (int i = 1; i < len; i++) 
        { 
            int key = arr[i]; 
            int j = i - 1; 

            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int a[])
    {
        int len = a.length;
        for (int i = 0; i < len; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}