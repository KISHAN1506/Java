public class Q6 {
    public static void main(String[] args) {
        int arr[] = {1,5,1,3,4,2};
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}