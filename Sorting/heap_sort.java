/*
Heap Sort is a comparison based sorting technique,  used for sorting linear data structures, it got it name because, it is based on Binary Heap Data Structures. Heap resembles a complete binary tree.
*/

public class heap_sort {
    public static void main(String args[]) {
        int a[] = {12, 11, 13, 5, 6, 7};
        int len = a.length;

        heap_sort ob = new heap_sort();
        ob.sort(a);

        System.out.println("Sorted array is");
        printArray(a);
    }

    public void sort(int a[])
        {
            int len = a.length;

            for (int i = len / 2 - 1; i >= 0; i--)
            heapify(a, len, i);

            for (int i=len-1; i>=0; i--)
            {
                int temp = a[0];
                a[0] = a[i];
                a[i] = temp;

                heapify(a, i, 0);
            }
        }

        void heapify(int a[], int len, int i)
        {
            int largest = i;
            int l = 2*i + 1;
            int r = 2*i + 2;

            if (r < len && a[l] > a[largest])
            largest = r;

            if (largest != i)
                {
                    int swap = a[i];
                    a[i] = a[largest];
                    a[largest] = swap;

                    heapify(a, len, largest);
                }
        }

        static void printArray(int a[])
            {
                int len = a.length;
                for (int i=0; i<len; ++i)
                System.out.print(a[i]+" ");
                System.out.println();
            }
}