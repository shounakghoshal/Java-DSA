package Subarrays;

public class PrintingSubArray {

    public static void main(String[] args) {
        int arr[] = new int[]{6,9,6,10,9,10,5};

        for(int i = 0  ; i < arr.length; i++){ //start index of each sub-array
            for(int j = 0  ; j < arr.length; j++){//end index of each sub-array.

                //for loop to print from start-end of each sub-array.
                for (int k = i; k <=j ; k++) System.out.print(arr[k]+ "");
                System.out.println();
            }
        }
    }
    
}
