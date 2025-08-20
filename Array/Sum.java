package Array;

public class Sum {
    public static void main(String[] args) {
        // int n = sc.nextInt();
        // int [] arr = new int[n];

        // for(int i = 0; i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        int[] arr = {1,2,3,4,5,6,7,8,9};
        //main logic
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum =sum + arr[i];

        }
        System.out.println(sum);

    }
}
