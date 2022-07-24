//Q. Given two bit strings add them.


public class BitAddition {

    public String reverse(String s){
        String reverse = "";
        int length = s.length();

        // for (int i = length-1; i>=0; i--){
        //     reverse += s.chartAt(0);

        // } 

        return reverse;
    }
    public String addBinary(String A, String B) {

        int sizeA = A.length();
        int sizeB = B.length();

        int carry = 0;
        String ans = "";

        int i = sizeA - 1;
        int j = sizeB - 1;

        while(i >= 0 || j >=0 || carry>0){
            int sum = 0;
            System.out.println(A.chartAt(i));
            System.out.println(B.chartAt(j));

            if (i >=0 ){
                sum +=  Integer.parseInt(String.valueOf(A.chartAt(i))) ;
                i--;
            }
             if (j >=0 ){
                sum +=  Integer.parseInt(String.valueOf(B.chartAt(j)));
                j--;
            }
            sum += carry;

            int bit = sum %2;
            carry = carry/2;

            ans += bit;
        }

        return ans;

    }
}
