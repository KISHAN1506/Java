public class Arrays {
    public static void main(String[] args) {
        int[] arr = {100,23,44,54,33};
        System.out.println(arr.length);

        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        // Quick Quiz
        for(int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

        // STL Method

        for(int it : arr){
            System.out.println(it);
        }
    }
}