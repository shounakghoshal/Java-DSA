package InterviewQuestions;

//Q. Given a binary array, we can at-max [replace] a single 0 with 1. Find the max consecutive 1's we can get.
//eg: 110101 ==> replace index 2 with last 1; we get : 1111 ==> ans : 4.

public class One {

    public static void main(String[] args) {

        int arr[] = new int[]{1,1,0,1,1,0,1,1,1};
        int length = arr.length;

        //edge case handling:

        int oneCount = 0;
        for(int i = 0; i < length; i++){
            if(arr[i] == 1) oneCount++;
        }

        if(oneCount == length) System.out.println(length); //edge case handled.

        int ans = 0;
        for (int i = 0 ; i < length; i++){
            //counting 1s for particular 0.
            if(arr[i] == 0){

                //counting 1's on left
                int left = 0;
                for(int j = i-1; j >= 0 ;j--){
                    if(arr[j] == 1) left++;
                    else break;
                }

                //counting 1's on right
                int right = 0;
                for(int j = i+1; j < length;j++){
                    if(arr[j] == 1) right++;
                    else break;
                }

                //totalOnes possible for a particular zero = left + right + 1(zero replaced by 1)
                int totalOnes = left+right+1;
                ans = Math.max(totalOnes,ans);  //comparing with previous length.
            }
        }

        System.out.println(ans);
    }
    
}



//Idea: For every zero in array: iterate and calculate no. of 1's on left side and 1's on right side. Store largest value.
//NOTE: time complexity is O(N) since break present and each part is iterated only once.
//edge case: if array contains all 1's return sizze of array.