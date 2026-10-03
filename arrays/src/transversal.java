public class transversal {
    static void transverseArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }
    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0]=12;
        arr[1]=5;
        arr[2]=14;
        arr[3]=18;
        arr[4]=7;
        transverseArray(arr);
    }
}