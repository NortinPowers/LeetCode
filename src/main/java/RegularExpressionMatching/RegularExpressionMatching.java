package RegularExpressionMatching;

import java.util.ArrayList;

public class RegularExpressionMatching {
    public static void main(String[] args) {
        SolutionRegularExpressionMatching solutionRegularExpressionMatching = new SolutionRegularExpressionMatching();
        String s = "aab"; //
        String p = "c*a*b"; //true
        System.out.println(solutionRegularExpressionMatching.isMatch(s, p));
        String s1 = "aaa"; //
        String p1 = "aaaa"; //false
        System.out.println(solutionRegularExpressionMatching.isMatch(s1, p1));
        String s2 = "aaa"; //
        String p2 = "ab*ac*a"; //false???
        System.out.println(solutionRegularExpressionMatching.isMatch(s2, p2));
    }
}
//misunderstood the condition
class SolutionRegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        boolean b = false;
        if (s.length() > 0 && s.length() < 21 && p.length() > 0 && p.length() < 31) {
            char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            ArrayList<Character> alphabetList = new ArrayList<>();
            for (int i = 0; i < alphabet.length; i++) {
                alphabetList.add(alphabet[i]);
            }
            char[] charsS = s.toCharArray();
            ArrayList<Character> sList = new ArrayList<>();
            for (int i = 0; i < charsS.length; i++) {
                sList.add(charsS[i]);
            }
            char[] charsP = p.toCharArray();
            ArrayList<Character> pList = new ArrayList<>();
            for (int i = 0; i < charsP.length; i++) {
                pList.add(charsP[i]);
            }
            int count = 0;
            while (sList.size() <= pList.size()) {
                for (int i = 0; i < s.length(); i++) {
                    if (sList.get(i) == pList.get(i) || pList.indexOf('.') == i || pList.indexOf('*') == i) {
                        if (pList.indexOf('.') == i) {
                            pList.set(i, sList.get(i));
                        }
                        if (pList.indexOf('*') == i) {
                            int index = 0;
                            try {
                                index = alphabetList.indexOf(sList.get(i - 1));
                            } catch (Exception e) {
                                index = alphabetList.indexOf(sList.get(i));
                            }
                            for (int j = index; j < alphabetList.size(); j++) {
                                if (alphabetList.contains(sList.get(i))) {
                                    pList.set(i, sList.get(i));
                                }
                            }
                        }
                    }
                }
                // System.out.println(sList);
                // System.out.println(pList);
                if (sList.equals(pList)) {
                    b = true;
                    return b;
                }
                pList.clear();
                for (int i = 0; i < charsP.length; i++) {
                    pList.add(charsP[i]);
                }
                if (pList.contains('*')){
                count++;
                //System.out.println(count);
                    try {
                for (int i = 0; i < count; i++) {
                    pList.remove(i);
                }} catch (Exception e) {
                        break;
                    }
                } else {break;}
                //System.out.println(sList.size());
                //System.out.println(pList.size());
            }
        }
        return b;
    }
}
