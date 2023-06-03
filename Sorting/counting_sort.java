/*
Counting Sort is a Integer-Sorting Algorithm, it is a bit-different and complicated from other comparison based sorting algorithms. Counting sort works efficiently on only positive integers, where it consider a Key element for various input values which are smaller than the key values, and falls in the range of 0-Key.
*/

import java.util.Arrays;

class counting_sort {
    void applycountSort(int array[], int size) {
        int[] output = new int[size + 1];

        int max = array[0];
        for (int i = 1; i < size; i++) { if (array[i] > max)
                max = array[i];
        }
        int[] count = new int[max + 1];

        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        for (int i = 0; i < size; i++) {
            count[array[i]]++;
        }

        for (int i = 1; i <= max; i++) 
        { 
            count[i] += count[i - 1]; 
        } 

        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }
    }

    public static void main(String args[]) {
        int[] data = {2, 5, 2, 8, 1, 4, 1};
        int size = data.length;

        counting_sort obj = new counting_sort();
        obj.applycountSort(data, size);

        System.out.println("Array After Sorting: ");
        System.out.println(Arrays.toString(data));
    }
}