package CheckIfTheSentenceIsPangram;

import java.util.ArrayList;

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        SolutionCheckIfTheSentenceIsPangram solutionCheckIfTheSentenceIsPangram = new SolutionCheckIfTheSentenceIsPangram();
        String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(solutionCheckIfTheSentenceIsPangram.checkIfPangram(str)); //true
        String str1 = "leetcode";
        System.out.println(solutionCheckIfTheSentenceIsPangram.checkIfPangram(str1)); //false
        String str2 = "";
        System.out.println(solutionCheckIfTheSentenceIsPangram.checkIfPangram(str2)); //false
        String str3 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        System.out.println(solutionCheckIfTheSentenceIsPangram.checkIfPangram(str3)); //false



    }
}

class SolutionCheckIfTheSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() == 0 && sentence.length() > 1000) {
            return false;
        }
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        ArrayList<Character> alphabetList = new ArrayList<>();
        for (int i = 0; i < alphabet.length; i++) {
            alphabetList.add(alphabet[i]);
        }
        //System.out.println(alphabetList);
        char[] sent = sentence.toCharArray();
        ArrayList<Character> sentArray = new ArrayList<>();
        for (int i = 0; i < sent.length; i++) {
            sentArray.add(sent[i]);
        }
        //System.out.println(sentArray);
        for (int i = 0; i < alphabetList.size(); i++) {
            if (sentArray.contains(alphabetList.get(i))) {
            } else {
                return false;
            }
        }
        return true;
    }
}
