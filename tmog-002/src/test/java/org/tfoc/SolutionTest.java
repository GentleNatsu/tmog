package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class SolutionTest {

    @Test
    void testSolution() {
        System.out.println(Solution.isValid("()()()()()"));
        log.info("Don't forget to write the tests to make sure it works. Enjoy!");
    }

}