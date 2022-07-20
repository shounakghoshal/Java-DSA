package CarryForward;

//Q. Given a char array calculate number of pairs i, j such that i < j
//eg : [b,a,a,g,d,c,a,g] : find pair of 'a' and 'g' => ans = 5 


//idea : for every i we are counting no. of j on right side. start from right, increase j count. when i ==> ans += jcount

public class TwoPairChar {
    public static void main(String[] args) {

        String string = "adgagagfg";
        char[] charArr = string.toCharArray();

        int length = string.length()-1;

        int gCount = 0;
        int ans = 0;
        for(int i = length; i>=0; i--){
            if(string.charAt(i)=='g') gCount++;
            if(string.charAt(i)=='a') ans += gCount;
        }

        System.out.println(ans);        
    }
    
}
