package LongestCommonPrefix;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        SolutionLongestCommonPrefix solutionLongestCommonPrefix = new SolutionLongestCommonPrefix();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(solutionLongestCommonPrefix.longestCommonPrefix(strs)); //fl
        String[] strs1 = {"dog","racecar","car"};
        System.out.println(solutionLongestCommonPrefix.longestCommonPrefix(strs1)); //""
        String[] strs2 = {"baaad","badaa","baaaaa"};
        System.out.println(solutionLongestCommonPrefix.longestCommonPrefix(strs2)); //"ba"
        String[] strs3 = {"a"};
        System.out.println(solutionLongestCommonPrefix.longestCommonPrefix(strs3)); //"a"
        String[] strs4 = {"flower","flower","flower","flower"};
        System.out.println(solutionLongestCommonPrefix.longestCommonPrefix(strs4)); //"a"



    }
}

class SolutionLongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length > 200 || strs.length < 1) {
            return "";
        }
        if (strs[0].length() <= 0) {
            return "";
        }
        char[] firstElem = strs[0].toCharArray();
        if (strs.length == 1) {
            return strs[0];
        }
        int count = 0;
        boolean b = true;
        String result = "";
        while (count < firstElem.length) {
            try {
                for (int i = 1; i < strs.length; i++) {
                    if (strs[i].toCharArray().length > 200) {
                        return "";
                    }
                    if (firstElem[count] != strs[i].toCharArray()[count]) {
                        b = false;
                        break;
                    }
                }
                if (b) {
                    result = result + firstElem[count];
                }
                count++;
            } catch (Exception e) {
                break;
            }
        }
        return result;
    }
}
