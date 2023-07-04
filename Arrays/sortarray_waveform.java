// Sort Array in Waveform
public class sortarray_waveform
{
    public static void makeWaveform(int n, int arr[])
    {
        int temp;
        for(int i = 0; i < n-1; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for(int i = 0; i < n; i += 2)
        {
            if(i < n-1)
            {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        
        System.out.print("Array in Waveform Pattern : ");
        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
    }
    
    public static void main(String args[])
    {
        int arr[] = { 5, 8, 1, 4, 6, 3, 2, 7 };
        int n = arr.length;
        makeWaveform(n, arr);
    }
}