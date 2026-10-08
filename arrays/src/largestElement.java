import java.util.Arrays;
/* largest element wth out sorting*/
public class largestElement {

    public static void main(String[] args){
        int[] arr = {3,9,4,5,7};
        int largest =arr[0];
        int n=arr.length;

        for(int i=0;i<n;i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

        }
        System.out.println("case1: "+ largest);

        Arrays.sort(arr);

        System.out.println("case2: " +arr[n-1]);

    }

}

