public class insertion {
    static void insertionArray(int[] arr){
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
}
    static void main(String[] args){
        int[] arr = {12,5,14,18,7};
        insertionArray(arr);
        arr[0]=9;
        insertionArray(arr);


    }
}
