package ReverseInteger;

import java.util.ArrayList;

public class ReverseInteger {
    public static void main(String[] args) {
        ReverseIntegerSolution reverseIntegerSolution = new ReverseIntegerSolution();
        int i1 = 123; //321
        int i2 = -123; //-321
        int i3 = 120; //21
        int i4 = 1534236469;
        int i5 = -2147483648;
      /*  System.out.println(reverseIntegerSolution.reverse(i1));
        System.out.println(reverseIntegerSolution.reverse(i2));
        System.out.println(reverseIntegerSolution.reverse(i3));
        System.out.println(reverseIntegerSolution.reverse(i4));
        System.out.println(reverseIntegerSolution.reverse(i5));*/
        int iT = 100000;
        ReverseIntegerSolutionNew reverseIntegerSolutionNew = new ReverseIntegerSolutionNew();
        System.out.println(reverseIntegerSolutionNew.reverse(iT));
        System.out.println(reverseIntegerSolutionNew.reverse(i1));
        System.out.println(reverseIntegerSolutionNew.reverse(i2));
        System.out.println(reverseIntegerSolutionNew.reverse(i3));
        System.out.println(reverseIntegerSolutionNew.reverse(i4));
        System.out.println(reverseIntegerSolutionNew.reverse(i5));

    }
}
//faster
class ReverseIntegerSolution {
    public int reverse(int x) {
        int i = x;
        int j;
        int res;
        double d;
        if (x == 0) {
            return 0;
        }
        if (-2147483648 < x & x < 2147483647) {
            ArrayList<Character> ArrayList = new ArrayList<>();
            if (i < 0) {
                j = -i;
            } else {
                j = i;
            }
            String str = Integer.toString(j);
            char[] chars = str.toCharArray();
            for (int v = 0; v < chars.length; v++) {
                ArrayList.add(chars[v]);
            }
            boolean zero = true;
            while (zero) {
                if (ArrayList.get(ArrayList.size() - 1) == 0 & ArrayList.size() > 0) {
                    ArrayList.remove(ArrayList.size() - 1);
                } else {
                    zero = false;
                }
            }
            String strRev = "";
            for (int v = ArrayList.size() - 1; v >= 0; v--) {
                strRev = strRev + ArrayList.get(v).toString();
            }

            if (i < 0) {
                strRev = "-" + strRev;
                d = Double.valueOf(strRev);
            } else {
                d = Double.valueOf(strRev);
            }
            if (-2147483648 > d || d > 2147483647) {
                return 0;
            } else {
                res = (int) d;
            }
        } else {
            res = 0;
        }
        return res;
    }
}

class ReverseIntegerSolutionNew {
    public int reverse(int x) {
        int i = x;
        int j;
        int res;
        double d;
        if (x == 0) {
            return 0;
        }
        while (i % 10 == 0) {
            i = i / 10;
        }
        if (i < 0) {
            if (i == -2147483648) {return 0;}
            j = -i;
        } else {
            j = i;
        }
        String str = Integer.toString(j);
        char[] chars = str.toCharArray();
        String strRev = "";
        for (int v = chars.length - 1; v >= 0; v--) {
            strRev = strRev + chars[v];
        }
        if (i < 0) {
            strRev = "-" + strRev;
            d = Double.valueOf(strRev);
        } else {
            d = Double.valueOf(strRev);
        }
        if (-2147483648 > d || d > 2147483647) {
            return 0;
        } else {
            res = (int) d;
        }
        return res;
    }
}
