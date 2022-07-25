package Subarrays;

//Q. Find sum of all sub-arrays
public class TotalSubArraySum {

    public static int contributionTechnique(int[] arr){
        //Idea: how mant times each index of arr appears in subarrays. Basically, contribution of each index in 
        // total sum.
        int N = arr.length;

        int sum = 0;

        for(int i = 0; i < N; i++){
            int times = (i+1)*(N-i);
            int contribution = times * arr[i];   //eg: i = 0; [6] occurs 4 times in total (0+1)(4-0): 4* [6]

            sum += contribution;
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{6,8,-1,7};

        int length = arr.length;
        int totalSum = 0;


        for(int i = 0; i < length; i++){
            int sum = 0; // sum of each sub-array starting at index i.
            for(int j = i; j < length; j++){
                sum += arr[j];
                totalSum += sum;
            }
        }


        System.out.println(totalSum); //O(N^2)
        System.out.println(contributionTechnique(arr)); // O(N) 

        
    }
    
}
