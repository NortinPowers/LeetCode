package ValidParentheses;

import java.util.ArrayList;

public class ValidParentheses {
    public static void main(String[] args) {
        SolutionValidParentheses solutionValidParentheses = new SolutionValidParentheses();
        String s1 = "()";
        System.out.println(solutionValidParentheses.isValid(s1)); //true
        System.out.println("-------next");
        String s2 = "()[]{}";
        System.out.println(solutionValidParentheses.isValid(s2)); //true
        System.out.println("-------next");
        String s3 = "(]";
        System.out.println(solutionValidParentheses.isValid(s3)); //false
        System.out.println("-------next");
        String s4 = "({[]})";
        System.out.println(solutionValidParentheses.isValid(s4)); //true
        System.out.println("-------next");
        String s5 = "(([]){})";
        System.out.println(solutionValidParentheses.isValid(s5)); //true
        System.out.println("-------next");
        String s6 = "([)]";
        System.out.println(solutionValidParentheses.isValid(s6)); //false
    }
}

//incorrect ([)]
/*
class SolutionValidParentheses {
    public boolean isValid(String s) {
        if (s.length() > 104 || s.length() < 1) {
            return false;
        }
        char[] chars = s.toCharArray();
        boolean b = true;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                if (s.contains(")") && s.indexOf("(") < s.indexOf(")")) {
                    chars[i] = '\u0000';
                    chars[s.indexOf(")")] = '\u0000';
                } else {
                    b = false;
                }
            }
            if (chars[i] == '[') {
                if (s.contains("]") && s.indexOf("[") < s.indexOf("]")) {
                    chars[i] = '\u0000';
                    chars[s.indexOf("]")] = '\u0000';
                } else {
                    b = false;
                }
            }
            if (chars[i] == '{') {
                if (s.contains("}") && s.indexOf("{") < s.indexOf("}")) {
                    chars[i] = '\u0000';
                    chars[s.indexOf("}")] = '\u0000';
                } else {
                    b = false;
                }
            }
        }
        return b;
    }
}*/

class SolutionValidParentheses {
    public boolean isValid(String s) {
        if (s.length() > 10000 || s.length() < 1) {
            return false;
        }
        char[] chars = s.toCharArray();
        boolean b = true;
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            characters.add(chars[i]);
        }
//        System.out.println("chars: " + characters);
        int count = 0;
        try {
            while (characters.size() * 10000 > count) {
                if (characters.contains('(') && characters.get(characters.lastIndexOf('(') + 1).equals(')')) {
                    characters.remove(characters.lastIndexOf('(') + 1);
                    characters.remove(characters.lastIndexOf('('));
//                    System.out.println("-1-");
                }
                if (characters.contains('[') && characters.get(characters.lastIndexOf('[') + 1) == ']') {
                    characters.remove(characters.lastIndexOf('[') + 1);
                    characters.remove(characters.lastIndexOf('['));
//                    System.out.println("-2-");
                }
                if (characters.contains('{') && characters.get(characters.lastIndexOf('{') + 1) == '}') {
                    characters.remove(characters.lastIndexOf('{') + 1);
                    characters.remove(characters.lastIndexOf('{'));
//                    System.out.println("-3-");
                }
                count++;
            }
        } catch (Exception e) {
            System.out.println("exc");
        }
//        System.out.println("char red: " + characters);
//        System.out.println("size: " + characters.size());
        if (characters.size() > 0) {
            b = false;
        }
        return b;
    }
}