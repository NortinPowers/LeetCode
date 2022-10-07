package StringToIntegerAtoi;

import java.util.ArrayList;

public class StringToIntegerAtoi {
    public static void main(String[] args) {
        SolutionStringToIntegerAtoi solutionStringToIntegerAtoi = new SolutionStringToIntegerAtoi();

        String s1 = "0045";

        System.out.println(solutionStringToIntegerAtoi.myAtoi(s1));

        /*char c ='0';
        int i = c -'0';
        System.out.println(i);*/
        //System.out.println(Math.pow(2,31)-1);
    }
}

class SolutionStringToIntegerAtoi {
    public int myAtoi(String s) {
        if (s.length()>200){return 0;}
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        char[] chars = s.toCharArray();
        boolean negative = false;
        int interim;
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            try {
                interim = Integer.parseInt(Character.toString(chars[i])); //chars[i]-'0';
                integerArrayList.add(interim);
            } catch (Exception e) {
                if (chars[0] == '-' && i == 0) {
                    negative = true;
                } else {
                if (chars[0] == '+' && i == 0) {
                } else {
                break;}
                };
            }
        }
        //System.out.println(integerArrayList);
        String res = "";
        for (int i = 0; i < integerArrayList.size(); i++) {
            res = res + integerArrayList.get(i);
        }
        int result = 0;
        if (integerArrayList.size() > 0) {
            try {
                result = Integer.parseInt(res);
            } catch (Exception e) {
                result = (int) (Math.pow(2, 31) - 1); // 2147483647;
                if (negative) {
                    result = -result - 1;
                }
            }
            if (negative) {
                result = -result;
            }

        }
        return result;
    }
}