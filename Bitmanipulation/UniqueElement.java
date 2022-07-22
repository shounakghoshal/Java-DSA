//Q. Given an array of elements, find unique element. All other elements are doubles.

//Idea: a ^ b ^ c ^ b ^ a = a ^ a ^ b ^ b ^ c = c          Formula: a^a = 0 ; a^0 = a 
public class UniqueElement {
    public static void main(String[] args) {
        int arr[] = new int[]{6,9,6,10,9,10,5};

        int length = arr.length;
        int ans = 0; // NOTE: a^0 = a; hence initialize ans to zero.
        for (int i = 0; i < length; i++){
            ans = ans ^ arr[i];
        }

        System.out.println(ans);
    }
    
}
