import java.util.*;
public class Bubble_sort{
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       int[] arr = {56,69,72,73,49,98,5,98,32,12,0,87};
       int n = arr.length;

       for(int i=0;i<=n-1;i++){
        for(int j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
       }
       for(int num:arr){
        System.out.println(num+"");
       }
    }
}