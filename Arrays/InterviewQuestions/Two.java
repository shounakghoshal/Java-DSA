package InterviewQuestions;

//Q. Given a binary array, we can at-max [swap] a single 0 with 1. Find the max consecutive 1's we can get.
//eg: 110101 ==> replace index 2 with last 1; we get : 111100 ==> ans : 4.

public class Two {
    public static void main(String[] args) {

        int arr[] = new int[]{1,1,0,1,1,0,1,1,1};
        int length = arr.length;

        //count total number of 1s
        int oneCount = 0;
        for(int i = 0; i < length; i++){
            if(arr[i] == 1) oneCount++;
        }

        if(oneCount == length) System.out.println(length);

        int ans = 0;
        for (int i = 0; i < length; i++){
            if(arr[i] == 0){
                //iterate and count 1s to left
                int left = 0;
                for (int j = i-1; j >=0; j++){
                    if(arr[j] == 1) left++;
                    else break; //break when zero encountered.
                }

                int right = 0;
                for (int j = i+1; j < length; j++){
                    if(arr[j] == 1) left++;
                    else break; //break when zero encountered.
                }

                int currentOnes = left+right;

                //check if 1 available for swapping.
                if (currentOnes < oneCount) ans = currentOnes+1;
                else ans = currentOnes;

            }
        }

        System.out.println(ans);

        
    }
    
}

//Observation: Similar as question One, but since it's swap instead of replace. We have to check if extra one present.
//Idea: count total number of 1s in array --> if (left+right < count) => left+right+1
                                            //   else = > left+right i/e no extra one present to swap.
