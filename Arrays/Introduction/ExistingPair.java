package Introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Question. Given an array and a target K(eg: 10). Find if any pair of numbers is equal to k.
//Note : same index of array not to be considered.

public class ExistingPair{

    public static boolean checkPairExists(List<Integer> input, int target){

        Map<Integer,Integer> checkMap = new HashMap<>();
        
        for(Integer inputValue: input){
            if (checkMap.containsKey(target-inputValue)){
                return true;
            }
            checkMap.put(inputValue, 1);
        }
        return false;

    }
    public static void main(String[] args) {

        List<Integer> input = new ArrayList<>();
        input =  Arrays.asList(3,-2,1,4,3,6,8);
        int target = 10;

        System.out.println(checkPairExists(input, target));

    }

}
