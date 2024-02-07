package org.tfoc;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public static boolean isValid(String s) {

        char[] charray = s.toCharArray();
        int contadorParentesis = 0;
        int contadorCorchetes = 0;
        int contadorLlaves = 0;
        for (char c : charray) {
            if (contadorParentesis < 0 || contadorLlaves < 0 || contadorCorchetes < 0) {
                return false;
            }
            if (c == '(') {
                contadorParentesis++;
            }
            if (c == ')') {
                contadorParentesis--;
            }

            if (c == '[') {
                contadorCorchetes++;
            }
            if (c == ']') {
                contadorCorchetes--;
            }

            if (c == '{') {
                contadorLlaves++;
            }
            if (c == '}') {
                contadorLlaves--;
            }
        }
        return contadorParentesis == 0 && contadorCorchetes == 0 && contadorLlaves == 0;
    }

}
