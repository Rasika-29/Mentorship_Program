import java.util.*;
public class largest{

    public static int largest_arr(int arr[]){
        int largest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
        
    }

    
    public static void main(String args[]){

        int arr[] = {1,4,5,3,2};
        System.out.println(largest_arr(arr));

    }
}