// Find Pairs in Array with given sum in java.

/*

Method 2 : Sorting Method

    1. The array is first sorted in ascending order in the sorting technique.
    2. Then, we employ two pointers, one of which points to the first element and the other to the last element.
    3. These two pointers values are added, and we then check to see if the result equals the specified sum.
    4. The left pointer is increased if the value is less than the total, and the right pointer is decreased if the value is higher.
    5. This method has a time complexity of O(n log n) due to the sorting algorithm used.

*/

import java.util.*;

public class pairSumArray
{
    public static void findPairs(int arr[], int n, int targetSum)
    {
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        System.out.print("The pairs present are : ");
        while (left < right)
        {
            int currSum = arr[left] + arr[right];
            if(currSum == targetSum)
	        {
	            System.out.print("(" + arr[left] + ", "+ arr[right] + ") ");
	            left++;
	            right--;
	        }
            else if (currSum < targetSum)
	        {
	            left++;
	        }
            else
	        {
	            right--;
	        }
        }
    }
    
    public static void main(String args[])
    {
        int arr[] = { 5, 8, 1, 4, 6, 3, 2, 7 };
        int n = arr.length;
        int targetSum = 10;
        findPairs (arr, n, targetSum);
    }
}