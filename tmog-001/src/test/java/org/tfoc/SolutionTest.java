package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class SolutionTest {

    @Test
    void testSolution() {
        int[] nums = new int[]{2,5,5,11};
        int target = 10;
        var result= Solution.twoSum(nums,target);
        System.out.println(result[0]+","+result[1]);
        log.info("Don't forget to write the tests to make sure it works. Enjoy!");
    }

}