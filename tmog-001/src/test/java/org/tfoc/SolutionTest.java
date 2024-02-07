package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class SolutionTest {

    @Test
    void testSolution() {
        int[] nums = new int[]{3,3};
        int target = 6;
        Solution solution= new Solution();
        var result= solution.twoSum(nums,target);
        System.out.println(result[0]+","+result[1]);
        log.info("Don't forget to write the tests to make sure it works. Enjoy!");
    }

}