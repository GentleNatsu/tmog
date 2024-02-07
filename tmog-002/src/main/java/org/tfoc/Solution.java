package org.tfoc;

import java.util.ArrayList;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public static boolean isValid(String s) {

        char[] charray = s.toCharArray();
        int contadorParentesis = 0;
        int contadorCorchetes = 0;
        int contadorLlaves = 0;
        var listaCierres = new ArrayList<Character>();

        for (char c : charray) {
            if (contadorParentesis < 0 || contadorLlaves < 0 || contadorCorchetes < 0) {
                return false;
            }
            if (c == '(') {
                contadorParentesis++;
                listaCierres.add(0,')');
            }
            if (c == ')') {
                if (listaCierres.isEmpty() || !listaCierres.get(0).equals(')')) {
                    return false;
                }
                listaCierres.remove(0);
                contadorParentesis--;
            }

            if (c == '[') {
                contadorCorchetes++;
                listaCierres.add(0,']');
            }
            if (c == ']') {
                if (listaCierres.isEmpty() || !listaCierres.get(0).equals(']')) {
                    return false;
                }
                listaCierres.remove(0);
                contadorCorchetes--;
            }

            if (c == '{') {
                contadorLlaves++;
                listaCierres.add(0,'}');
            }
            if (c == '}') {
                if (listaCierres.isEmpty() || !listaCierres.get(0).equals('}')) {
                    return false;
                }
                listaCierres.remove(0);
                contadorLlaves--;
            }
        }
        return contadorParentesis == 0 && contadorCorchetes == 0 && contadorLlaves == 0;
    }

}
