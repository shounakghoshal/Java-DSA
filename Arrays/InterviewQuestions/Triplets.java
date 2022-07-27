package InterviewQuestions;

//Q.Given arr[N] elements, calculate number of triplets i,j,k such that i<j<k && arr[i] < arr[j] < arr[k] 
public class Triplets {

    public static void main(String[] args) {
        int arr[] = new int[]{4,1,2,6,9,7};
        int length = arr.length;

        int ans = 0;

        for(int i = 0; i < length; i++){

            //calculate smaller elements count to the left of index.
            int left = 0;
            for(int j = i-1; j >=0; j--){
                if(arr[j]<arr[i]) left++;
            }

            //calculate greater elements count to the right of index.
            int right = 0;
            for(int j = i+1; j < length; j++){
                if(arr[j]>arr[i]) right++;
            }

            ans += left*right;   //possible triplets for each index.
        }

        System.out.println(ans);
    }
    
}

//Idea : 
// for each index get left count where elements to the left are < indexElement.
//get right count where elements to the right are > indexElement.
//total possible triplets from the index = left + right. 

