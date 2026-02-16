import java.util.*;
    class LinearSearch{
    public static void main(String[] args){
        int[] arr = {12,69,11,8,92,34};
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value");
        int TargetVal = sc.nextInt();
        int result = LinearSearch(arr,TargetVal);

        if(result != -1){
            System.out.println("value "+TargetVal+" found at index "+result);
        }else{
            System.out.println("value "+TargetVal+" not found");
        }

    }

   public static int LinearSearch(int[] arr,int TargetVal){
            for(int i=0;i<arr.length;i++){
                if(arr[i] == TargetVal){
                    return i;
                }
            }
            return -1;
    }
}