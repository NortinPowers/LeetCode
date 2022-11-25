package MaximumLengthOfAConcatenatedStringWithUniqueCharacters;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximumLengthOfAConcatenatedStringWithUniqueCharacters {
    public static void main(String[] args) {
        SolutionMaximumLengthOfAConcatenatedStringWithUniqueCharacters sol =
                new SolutionMaximumLengthOfAConcatenatedStringWithUniqueCharacters();
        List<String> arr1 = Arrays.asList("un", "iq", "ue");
        System.out.println(sol.maxLength(arr1)); //4
        List<String> arr2 = Arrays.asList("cha", "r", "act", "ers");
        System.out.println(sol.maxLength(arr2)); //6
        List<String> arr3 = Arrays.asList("abcdefghijklmnopqrstuvwxyz");
        System.out.println(sol.maxLength(arr3)); //26
        System.out.println("--next--");
        List<String> arr34 = Arrays.asList("");
        System.out.println(sol.maxLength(arr34)); //0
        System.out.println("--next--");
        List<String> arr4 = Arrays.asList("abcdefghijk", "lmnopqrstuvwxyz");
        System.out.println(sol.maxLength(arr4)); //26
        System.out.println("--next--");
        List<String> arr5 = Arrays.asList("abcdefghijkl", "lmnopqrstuvwxyz");
        System.out.println(sol.maxLength(arr5)); //15
        System.out.println("--next--");
        List<String> arr6 = Arrays.asList("aa", "bb");
        System.out.println(sol.maxLength(arr6)); //0
        System.out.println("--next--");
        List<String> arr7 = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p");
        System.out.println(sol.maxLength(arr7)); //16
        System.out.println("--next--");
        List<String> arr8 = Arrays.asList("ab", "cd", "cde", "cdef", "efg", "fgh", "abxyz");
        System.out.println(sol.maxLength(arr8)); //11
    }
}

// incorrect (there is no verification of each individual element)
/*
class SolutionMaximumLengthOfAConcatenatedStringWithUniqueCharacters {
    public int maxLength(List<String> arr) {
        if (arr.size() < 1 || arr.size() > 16) {
            return 0;
        }
        arr.sort(Comparator.comparing(String::length));
        //System.out.println(arr);
        int c = arr.size() - 2;
        if (c < 0) {
            return arr.get(0).length();
        }
        //System.out.println("c= " + c);
        int maxLengthString = 0;
        int lastSize =0;
        while (c > -1) {
            String last = arr.get(arr.size() - 1);
            lastSize = last.length();
            if (lastSize< 0 || lastSize > 26) {
                return 0;
            }
            char[] chars = last.toCharArray();
            boolean identicalCharacters = true;
            String previous = arr.get(c);
            if (previous.length()< 0 || previous.length() > 26) {
                return 0;
            }
            for (int j = 0; j < chars.length; j++) {
                if (previous.contains(Character.toString(chars[j]))) {
                    identicalCharacters = false;
                    break;
                }
            }

           // System.out.println(previous + " lenght " + previous.length());
           // System.out.println(last + " lenght " + last.length());
            if (identicalCharacters) {
                if (maxLengthString < previous.length() + last.length()) {
                }
                maxLengthString = previous.length() + last.length();
            }
            c--;
           // System.out.println("next while c: " + c);
        }
        if (maxLengthString < lastSize) {
            maxLengthString=lastSize;
        }
        return maxLengthString;
    }
}
*/
// incorrect (does not reach the maximum length)
class SolutionMaximumLengthOfAConcatenatedStringWithUniqueCharacters {
    public int maxLength(List<String> arr) {
        if (arr.size() < 1 || arr.size() > 16) {
            return 0;
        }
        arr.sort(Comparator.comparing(String::length));
        //System.out.println(arr);
        int c = arr.size() - 2;
        if (c > 26) {
            return 0;
        }
        if (c < 0) {
            String onlyLast = arr.get(0);
            if (CheckIdenticalCharacters(onlyLast)) {
                return arr.get(0).length();
            }
        }
        //System.out.println("c= " + c);
        int maxLengthString = 0;
        int lastSize = 0;
        String last = arr.get(arr.size() - 1);
        if (last.length() > 26) {
            return 0;
        }
        if (CheckIdenticalCharacters(last)) {
            lastSize = last.length();
        }
        String summaryRow;
        String previous = "";
        while (c > -1) {
            previous = arr.get(c);
            if (previous.length() > 26) {
                return 0;
            }
            summaryRow = previous + last;
            if (CheckIdenticalCharacters(summaryRow)) {
                last = last + previous;
                if (maxLengthString < summaryRow.length()) {
                }
                maxLengthString = summaryRow.length();
            }
            c--;
        }
        if (maxLengthString < lastSize) {
            maxLengthString = lastSize;
        }

        return maxLengthString;
    }

    public static Boolean CheckIdenticalCharacters(String s) {
        char[] checkLast = s.toCharArray();
        boolean identicalCharacters = true;
        for (int i = 0; i < checkLast.length; i++) {
            String subString = s.substring(i + 1);
            if (subString.contains(Character.toString(checkLast[i]))) {
                identicalCharacters = false;
                break;
            }
        }
        return identicalCharacters;
    }
}
