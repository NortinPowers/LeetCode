package LongestSubstringWithoutRepeatingCharacters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String str = scanner.next();
        //String str ="aab"; //2
        //String str = "au"; //2
        //String str = "acbnawec"; //6
        //String str = "abcabcbb"; //3
        //String str = "bbbbb"; //1
        //String str = "pwwkew"; //3
        LongestSubstringWithoutRepeatingCharactersSolution solMethod = new LongestSubstringWithoutRepeatingCharactersSolution();
        System.out.println("Longest substring: " + solMethod.lengthOfLongestSubstring(str));

    }
}

class LongestSubstringWithoutRepeatingCharactersSolution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Character> characters = new ArrayList<>();
        if (chars.length > 50000) {
            return -1;
        }
        if (1 < chars.length) {
            for (int i = 0; i < chars.length; i++) {
                if (characters.contains(chars[i])) {
                    int rem = characters.indexOf(chars[i]);
                    integers.add(characters.size());
                    while (rem >= 0) {
                        characters.remove(rem);
                        rem--;
                    }
                    characters.add(chars[i]);
                } else {
                    characters.add(chars[i]);
                    integers.add(characters.size());
                }
            }
        } else {
            if (1 == chars.length) {
                return 1;
            } else {
                return 0;
            }
        }
        Collections.sort(integers);
        return integers.get(integers.size() - 1);
    }
}
