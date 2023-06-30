
/*Algorithm to reverse an array using third variable :

    START
    Initialize an array with values
    Take two variables left and right with left containing 0 and right containing rightmost index of array.
    Take a new variable as temp.
    Swap the values of left indices with the right indices using temp.
    Increment the left variable and decrement the right variable value.
    Repeat the steps from 4 to 5 till left is less than right.
    Print reverse array.
    END

*/

import java.util.*;
public class reverse
{
    public static void main (String[] args) 
    {
        
        String [] inputArray = {"India", "UK", "Pakistan", "Australia"};
        System.out.println("Initial String array : " + Arrays.toString(inputArray)); 
        reverse(inputArray);
    }
    public static void reverse(String [] inputArray)
    {
        for(int left = 0, right = inputArray.length - 1;left < right; left++, right--)
        {
            
            String temp = inputArray[left];
            inputArray[left]  = inputArray[right];
            inputArray[right] = temp;
        }
      
        System.out.print("Reverse Array : " + Arrays.toString(inputArray)); 
    }
}