package Subarrays;

//Q. Given N arrays, find the length of smallest subarray which contains both min and max of array

public class ClosestMinMax {
    public int solve(ArrayList<Integer> A) {
        //Step 1 : Iterate and find min and max.
        int length = A.size();

        if (length == 1) return 1;

        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i < length ; i++){
            if (A.get(i)< min) min = A.get(i);
            if(A.get(i) > max) max = A.get(i);
        }

        //Step 2 : Calculate length of minimum sub-array
        //Initialize minIndex,maxIndex, and answer.

        int minIndex = -1; //-1 means not found
        int maxIndex = -1;
        int ans = Integer.MAX_VALUE;

        //Process : 1. Start from right.
                //  2. if arr[j] == min ==> minIndex = j; if (maxIndex != -1) ==> ans = maxIndex - minIndex -1;  
                //  3. if arr[j] == max ==> maxIndex = j; if (minIndex != -1) ==> ans = minIndex - maxIndex -1; Note if (!= -1) index will be to right of j hence always greater. 
        
        for (int j = length-1; j >=0 ; j--){
            if(A.get(j) == min){
                minIndex = j;
                if(maxIndex != -1){
                    int step = maxIndex - minIndex + 1;
                    ans = Math.min(ans,step);   // least sub-array length required
                }
            }

             if(A.get(j) == max){
                maxIndex = j;
                if(minIndex != -1){
                    int step = minIndex - maxIndex + 1;
                    ans = Math.min(ans,step);   // least sub-array length required
                }
            }
        }

        return ans;

    }
}
