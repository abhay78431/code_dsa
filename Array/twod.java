package Array;

public class twod {
    public static void main(String[] args) {
        int [][] arr = new int[5][6];

        //set
        arr [1][3]=10;
        //get
        System.out.println(arr[1][3]);

        //row count
        System.out.println(arr.length);
        //column count
        System.out.println(arr[0].length);

        //terversal
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                System.out.print(row);
                System.out.print(col);
            }
        }
        System.out.println();
    }
    
}
