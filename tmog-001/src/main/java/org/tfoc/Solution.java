package org.tfoc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public static int[] twoSum(int[] nums, int target) {

        int[] solucion = new int[2];
        Map<Integer, Integer> mapita = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            solucion[0] = i;
            if(mapita.containsKey(nums[i]) && (nums[i]*2==target)){
                    solucion[1]=mapita.get(nums[i]);
                    break;
            }else{
                mapita.put(nums[i],i);
                Integer posibleSolucion= mapita.get(target-nums[i]);
                if (posibleSolucion != null && posibleSolucion != i) {
                    solucion[1] = posibleSolucion;
                    break;
                }
            }
        }
        return solucion;
    }

}
