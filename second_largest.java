import java.util.*;
public class second_largest{
public static void main(String args[]){
    int arr[] = {36,45,98,89,55};
    int temp;
    for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            if(arr[i] > arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    System.out.println("Second largest element in the array : "+arr[arr.length-2]);
}

}