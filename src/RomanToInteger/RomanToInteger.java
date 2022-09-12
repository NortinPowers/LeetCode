package RomanToInteger;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Roman number: ");
        String s = scanner.next();
        SolutionRomanToInteger solutionRomanToInteger = new SolutionRomanToInteger();
        System.out.println("The value of the Roman numeral: " + solutionRomanToInteger.romanToInt(s));

    }
}

class SolutionRomanToInteger {
    public int romanToInt(String s) {
        char[] ch = s.toCharArray();
        int result = 0;
        //check length
        if (ch.length == 0 || ch.length > 15) {
            result = -1;
        }
        if (result >= 0) {
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] != 'M' & ch[i] != 'C' & ch[i] != 'D' & ch[i] != 'L' & ch[i] != 'X' & ch[i] != 'V' & ch[i] != 'I') {
                    result = -1;
                    break;
                }
                if (ch[i] == 'M') {
                    result = result + 1000;
                }
                if (ch[i] == 'D') {
                    result = result + 500;
                }
                if (ch[i] == 'C') {
                    if (ch.length > (i + 1)) {
                        if (ch[i + 1] == 'M') {
                            result = result + 900;
                            i = i + 1;
                            continue;
                        }
                        if (ch[i + 1] == 'D') {
                            result = result + 400;
                            i = i + 1;
                            continue;
                        }
                    }
                    result = result + 100;
                }
                if (ch[i] == 'L') {
                    result = result + 50;
                }
                if (ch[i] == 'X') {
                    if (ch.length > (i + 1)) {
                        if (ch[i + 1] == 'C') {
                            result = result + 90;
                            i = i + 1;
                            continue;
                        }
                        if (ch[i + 1] == 'L') {
                            result = result + 40;
                            i = i + 1;
                            continue;
                        }
                    }
                    result = result + 10;
                }
                if (ch[i] == 'V') {
                    result = result + 5;
                }
                if (ch[i] == 'I') {
                    if (ch.length > (i + 1)) {
                        if (ch[i + 1] == 'X') {
                            result = result + 9;
                            i = i + 1;
                            continue;
                        }
                        if (ch[i + 1] == 'V') {
                            result = result + 4;
                            i = i + 1;
                            continue;
                        }
                    }
                    result = result + 1;
                }
            }
        }
        //check max result (already limited to other checks)
        if (result > 3999) {
            result = -1;
        }
        return result;
    }
}
