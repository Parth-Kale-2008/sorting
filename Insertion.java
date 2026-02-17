public class Insertion {
    public static void main(String[] args){
        int[] arr = {12,33,23,79,84,51,6};
        int n = arr.length;

        for(int i =1;i<n;i++){
            int insertindex = i;
            int currentvalue = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>currentvalue){
                arr[j+1] = arr[j];
                insertindex = j;
                j--;
            }
            arr[insertindex] = currentvalue;
        }
        System.out.println("sorted array: ");
        for(int value:arr){
            System.out.println(value+" ");
        }
    }
}
