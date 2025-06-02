public class Q8 {
    public static void main(String[] args) {
        int arr[] = {1,2,7,4,5,6};
        int ctr = 0;


        for(int i = 0;i < arr.length - 1;i++){
            if(arr[i] > arr[i+1]){
                ctr++;
                break;
            }
        }
        if(ctr == 1){
            System.out.println("Array is not Sorted");
        }else{
            System.out.println("Array is Sorted");
        }
    }
}