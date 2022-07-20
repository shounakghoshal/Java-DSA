package PrefixSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Q. Given N array elements and Q queries, for each query iterate and get sum of all even index elements in range.
//Algo: while creating prefix sum : add arr[i] only when index % 2 == 0
//                                  else add prefix[i-1];

public class EvenSum {
    public static int evenSum(List<Integer> arr, List<Integer> quriesList){
        int arrSize = arr.size();

        //initialize prefix sum
        ArrayList<Integer> prefixArrayList = new ArrayList<>();
 
        prefixArrayList.add(arr.get(0));
        int sum = arr.get(0);
        for(int i = 1; i < arrSize; i++){
            if(i % 2 == 0){  //if even index: add arr[i] to prefixArr
                sum += arr.get(i);
                prefixArrayList.add(sum);
            }
            else prefixArrayList.add(prefixArrayList.get(i-1)); // add prefixArr[i-1] to prefix[i]
        }
        
        int q = 0;
        while(q<=1){ // iterate over each query
            //take left and right indexes of each query.
            int left = quriesList.get(0);
            int right = quriesList.get(1);

            int rightMostSum = prefixArrayList.get(right);
            if (left == 0){
                return rightMostSum;
            }
            q++;
            return rightMostSum - prefixArrayList.get(left-1);
        }
        q++;
        return sum;
    }

    //Note : using prefix sum: the time complexity has been reduced from O(N^2) to O(N).

    public static void main(String[] args) {

        List<Integer> input = new ArrayList<>();
        input =  Arrays.asList(3,2,1,6,-3,2,8,4,9);

        List<Integer> queries = new ArrayList<>();
        queries =  Arrays.asList(0,8);

        System.out.println(evenSum(input, queries));
        
    }
    
}
