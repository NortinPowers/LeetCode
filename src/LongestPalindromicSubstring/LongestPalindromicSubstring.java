package LongestPalindromicSubstring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String st1 = "babad"; //bab or aba
        String st2 = "cbbd"; //bb
        String st3 = "absbsddsnm"; //sdds
        String st4 = "aaab"; //aaa
        String st5 = "bacbcah"; //acbca
        String st6 = "asdfghjkllkjhgfdsa"; //asdfghjkllkjhgfdsa
        String st7 = ""; // "leight error"
        String st8 = "qasdfghjkllkjhgfdsaaa"; // asdfghjkllkjhgfdsa
        String st9 = " "; //  " "
        String st10 = "101000"; // "101"
        String st101 = "dadaaa"; //dad
        String st11 = "d"; // "d"
        String st12 = "1"; // "1"
        String st13 = "a a"; // "a a"
        String st14 = " dc "; // " " "d" ..
        String st15 = "abc"; // "a" "b" "c"
        String st16 = "aab"; //"aa"
        String st17 = "aaaaaaaaav"; //"aaaaaaaaa"
        String st18 = "ab"; //"a" "b"
        String st19 = "aba"; //aba

        SolutionLongestPalindromicSubstringNew sol = new SolutionLongestPalindromicSubstringNew();
        //SolutionLongestPalindromicSubstringOld3 sol1 = new SolutionLongestPalindromicSubstringOld3();
        //System.out.println("answer:"+ sol.longestPalindrome(st19));
        //System.out.println("answer:"+ sol.longestPalindrome( st1));
        //System.out.println("answer:"+ sol.longestPalindrome(st2));
        // System.out.println("answer:"+ sol1.longestPalindrome(st2));
        //System.out.println("answer:"+ sol.longestPalindrome(st3));
        //System.out.println("answer:"+ sol.longestPalindrome(st4));
        //System.out.println("answer:"+ sol.longestPalindrome(st5));
        //System.out.println("answer:"+ sol.longestPalindrome(st6));
        //System.out.println("answer:"+ sol.longestPalindrome(st7));
        //System.out.println("answer:"+ sol.longestPalindrome(st8));
        //System.out.println("answer:"+ sol.longestPalindrome(st9));
        //System.out.println("answer:"+ sol.longestPalindrome(st10));
        //System.out.println("answer:"+ sol.longestPalindrome(st101));;
        // System.out.println("answer:"+ sol.longestPalindrome(st11));
        //System.out.println("answer:"+ sol.longestPalindrome(st12));
        //System.out.println("answer:"+ sol.longestPalindrome(st13));
        //System.out.println("answer:"+ sol.longestPalindrome(st14));
        // System.out.println("answer:"+ sol.longestPalindrome(st15));
        //System.out.println("answer:"+ sol.longestPalindrome(st16));
        //System.out.println("answer:"+ sol.longestPalindrome(st17));
        // System.out.println("answer:"+ sol.longestPalindrome(st18));


      /*  System.out.println("answer:" + sol.longestPalindrome(st1));
        System.out.println("answer:" + sol.longestPalindrome(st2));
        System.out.println("answer:" + sol.longestPalindrome(st3));
        System.out.println("answer:" + sol.longestPalindrome(st4));
        System.out.println("answer:" + sol.longestPalindrome(st5));
        System.out.println("answer:" + sol.longestPalindrome(st6));
        System.out.println("answer:" + sol.longestPalindrome(st7));
        System.out.println("answer:" + sol.longestPalindrome(st8));
        System.out.println("answer:" + sol.longestPalindrome(st9));
        System.out.println("answer:" + sol.longestPalindrome(st10));
        System.out.println("answer:" + sol.longestPalindrome(st101));
        ;
        System.out.println("answer:" + sol.longestPalindrome(st11));
        System.out.println("answer:" + sol.longestPalindrome(st12));
        System.out.println("answer:" + sol.longestPalindrome(st13));
        System.out.println("answer:" + sol.longestPalindrome(st14));
        System.out.println("answer:" + sol.longestPalindrome(st15));
        System.out.println("answer:" + sol.longestPalindrome(st16));
        System.out.println("answer:" + sol.longestPalindrome(st17));
        System.out.println("answer:" + sol.longestPalindrome(st18));
        System.out.println("answer:" + sol.longestPalindrome(st19));*/

        System.out.println(sol.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));

    }
}

//incorrect
class SolutionLongestPalindromicSubstringOld1 {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        ArrayList<Character> charactersList = new ArrayList<>();
        String str;
        int l;
        for (int i = 0; i < chars.length; i++) {
            charactersList.add(null);
            //System.out.println(charactersList);
        }
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<ArrayList> arrayLists = new ArrayList<>();
        ArrayList<Character> res;
        if (chars.length == 1) {
            System.out.println(Character.toString(chars[0]));
            return Character.toString(chars[0]);
        }
        if (chars.length > 1 & chars.length <= 1000) {
            for (int i = 0; i < chars.length; i++) {
                for (int j = chars.length - 1; j >= i; j--) {
                    if (chars[i] == chars[j] & i != j) {
                        //System.out.println(i + "  " + j);
                        int p = i;
                        int o = j;
                        int d;
                        for (int p1 = p; p1 < o; p1++) {
                            if (o - p1 > 2 & chars[p1 + 1] == chars[o - 1]) {
                                d = o - p1;
                                int st = p1;
                                int end = o;
                                while (d > 1) {
                                    if (chars[st + 1] == chars[end - 1]) {
                                        charactersList.set(st + 1, chars[st + 1]);
                                        charactersList.set(end - 1, chars[end - 1]);
                                    }
                                    st++;
                                    end--;
                                    d = end - st + 2;
                                }
                                charactersList.set(j, chars[j]);
                                charactersList.set(i, chars[i]);
                                while (charactersList.remove(null)) {
                                }
                                l = charactersList.size();
                                integerArrayList.add(l);
                                res = (ArrayList<Character>) charactersList.clone();
                                charactersList.clear();
                                for (int u = 0; u < chars.length; u++) {
                                    charactersList.add(null);
                                }
                                arrayLists.add(res);

                                System.out.println(arrayLists + "+");
                            }
                            if (o - p1 == 2 & chars[p1] == chars[i]) {
                                charactersList.set(j, chars[j]);
                                charactersList.set(i, chars[i]);
                                charactersList.set(p1 + 1, chars[p1 + 1]);
                                while (charactersList.remove(null)) {
                                }
                                l = charactersList.size();
                                integerArrayList.add(l);
                                res = (ArrayList<Character>) charactersList.clone();

                                charactersList.clear();
                                for (int u = 0; u < chars.length; u++) {
                                    charactersList.add(null);
                                }
                                arrayLists.add(res);

                                System.out.println(arrayLists + "++");
                            }
                            if (o - p1 <= 1 & chars[p1] == chars[o]) {
                                charactersList.set(j, chars[j]);
                                charactersList.set(i, chars[i]);
                                //System.out.println(charactersList+"&&&&");
                                while (charactersList.remove(null)) {
                                }
                                l = charactersList.size();
                                integerArrayList.add(l);
                                res = (ArrayList<Character>) charactersList.clone();
                                System.out.println(res + "---");
                                charactersList.clear();
                                for (int u = 0; u < chars.length; u++) {
                                    charactersList.add(null);
                                }
                                arrayLists.add(res);

                                System.out.println(arrayLists + "+++");
                            }
                        }
                    }
                }
            }
            //System.out.println(stringArrayList);
            //System.out.println(integerArrayList);
            //System.out.println(charactersList);
            System.out.println(arrayLists);
            ArrayList<Integer> integerArrayListIndex;
            integerArrayListIndex = (ArrayList<Integer>) integerArrayList.clone();
            Collections.sort(integerArrayListIndex);
            int value = integerArrayListIndex.get(integerArrayListIndex.size() - 1);
            int ind = integerArrayList.indexOf(value);
            str = (String) arrayLists.get(ind).stream().map(Object::toString).collect(Collectors.joining(""));
            System.out.println(str);
        } else {
            System.out.println("length error");
            return "";
        }
        return str;
    }
}

//incorrect
class SolutionLongestPalindromicSubstringOld2 {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        System.out.print("chars: ");
        System.out.println(chars);
        ArrayList<String> stringList = new ArrayList<>();
        String res = "";
        if (chars.length == 1) {
            System.out.println("test1");
            return Character.toString(chars[0]);
        }
        if (chars.length == 2) {
            if (chars[0] == chars[1]) {
                System.out.println("test2");
                return Character.toString(chars[0]) + Character.toString(chars[1]);
            } else {
                System.out.println("test2");
                return Character.toString(chars[0]);
            }
        }
        if (chars.length == 3) {
            if (chars[0] == chars[2]) {
                System.out.println("test3");
                return Character.toString(chars[0]) + Character.toString(chars[1]) + Character.toString(chars[2]);
            } else {
                if (chars[0] == chars[1]) {
                    System.out.println("test3");
                    return Character.toString(chars[0]) + Character.toString(chars[1]);
                }
                if (chars[2] == chars[1]) {
                    System.out.println("test3");
                    return Character.toString(chars[1]) + Character.toString(chars[2]);
                } else {
                    System.out.println("test3");
                    return Character.toString(chars[0]);
                }
            }
        }
        if (chars.length > 3 & chars.length < 5000) {
            boolean pol = true;
            for (int i = 1; i < chars.length - 1; i++) {
                int same = 0;
                if (chars[i] == chars[i + 1]) {
                    same++;
                    stringList.add(Character.toString(chars[i]) + Character.toString(chars[i + 1]));
                }


                int count = 1;
                while (chars.length > i + same + count & i - count >= 0) {
                    if (chars[i - count] != chars[i + same + count]) {
                        pol = false;
                    } else {
                        for (int j = i - count; j < i + same + count + 1; j++) {
                            res = res + chars[j];
                        }
                        stringList.add(res);
                        res = "";
                    }
                    count++;
                    //System.out.println(count);
                }
            }
        }
        System.out.println(stringList);
        if (stringList.size() > 0) {
            res = stringList.get(0);
            for (int i = 0; i < stringList.size() - 1; i++) {
                if (stringList.get(i).length() < stringList.get(i + 1).length()) {
                    res = stringList.get(i + 1);
                    //System.out.println(stringList.get(i + 1));
                    //System.out.println(stringList.get(i));
                }
            }
        }
        return res;
    }
}

//incorrect
class SolutionLongestPalindromicSubstringOld3 {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        if (chars.length > 1000) {
            return "";
        }
        //System.out.print("chars: ");
        //System.out.println(chars);
        ArrayList<Character> characters = new ArrayList<>();
        String res = "";
        for (int i = 0; i < chars.length; i++) {
            characters.add(chars[i]);
        }
        System.out.println(characters);
        ArrayList<Character> charactersRight = (ArrayList<Character>) characters.clone();
        //System.out.println("cR "+charactersRight);
        ArrayList<Character> charactersLift = (ArrayList<Character>) characters.clone();
        // System.out.println("cL "+charactersLift);
        String charRightAnalys = analysisMethod(charactersRight, chars, "R");
        String charLeftAnalys = analysisMethod(charactersLift, chars, "L");
        //for LR
        //String charRLAnalys = analysisMethod(charactersRight, chars, "RL");
        //String charLRAnalys = analysisMethod(charactersRight, chars, "LR");
        if (charLeftAnalys.length() >= charRightAnalys.length()) {
            res = charLeftAnalys;
        } else {
            res = charRightAnalys;
        }


        return res;
    }

    public String analysisMethod(ArrayList<Character> array, char[] chars, String C) {
        String res = "";
        boolean dobleMid = false;
        String doubleMidRes = "";

        int count = 0; // for LR and RL method

        while (array.size() >= 1) {
            if (array.size() == 1) {
                return array.get(0).toString();
            }
            if (array.size() == 2 & dobleMid == true) {
                array.clear();
                return doubleMidRes;
            }
            if (array.size() == 2) {
                if (array.get(0) == array.get(1)) {
                    array.clear();
                    return array.get(0).toString() + array.get(1).toString();
                }
                if (array.get(0) != array.get(1)) {
                    array.clear();
                    return array.get(0).toString();
                }
            }

            if (array.size() > 2) {
                int mid;
                ArrayList<Character> leftArray = new ArrayList<>();
                ArrayList<Character> rightArray = new ArrayList<>();
                if ((array.size() - 1) % 2 == 0) {
                    mid = (array.size() - 1) / 2;
                    System.out.println("mid: " + mid + " char: " + array.get(mid));
                    for (int i = 0; i < mid; i++) {
                        leftArray.add(array.get(i));
                    }
                    System.out.println(leftArray);
                    for (int i = array.size() - 1; i > mid; i--) {
                        rightArray.add(array.get(i));
                    }
                    System.out.println(rightArray);
                } else {
                    mid = array.size() / 2;
                    System.out.println("double mid: " + (mid - 1) + " and " + mid + " char: " + array.get(mid - 1) + array.get(mid));
                    dobleMid = true;
                    if (array.get(mid - 1) == array.get(mid)) {
                        doubleMidRes = array.get(mid - 1).toString() + array.get(mid).toString();
                        System.out.println("doubleMidRes: " + doubleMidRes);
                    }
                    for (int i = 0; i < mid - 1; i++) {
                        leftArray.add(array.get(i));
                    }
                    System.out.println(leftArray);
                    for (int i = array.size() - 1; i > mid; i--) {
                        rightArray.add(array.get(i));
                    }
                    System.out.println(rightArray);
                }

                if (leftArray.equals(rightArray)) {
                    System.out.println("equals");
                    for (int i = 0; i < array.size(); i++) {
                        res = res + array.get(i).toString();
                    }
                    System.out.println("res: " + res);
                    array.clear();
                    return res;

                } else {
                    System.out.println("Not equals");
                    leftArray.clear();
                    rightArray.clear();
                    if (C == "R") {
                        array.remove(array.size() - 1);
                    } else {
                        array.remove(0);
                    }
                    // for LR
                    /*if (C=="L") {array.remove(0);}
                    if (C=="LR") {
                        count++;
                        if (count%2==0){array.remove(array.size()-1);} else {array.remove(0);}
                        }
                    if (C=="RL") {
                        count++;
                        if (count%2==0){array.remove(0);} else {array.remove(array.size()-1);}
                    }*/
                    System.out.println("array NEW: " + array);
                }

            }
        }
        return res;
    }
}
//Time Limit Exceeded, BUT IT WORKING
class SolutionLongestPalindromicSubstringNew {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        if (chars.length > 1000 || chars.length == 0) {
            return "";
        }
        if (chars.length == 1) {
            return Character.toString(chars[0]);
        }
        if (chars.length == 2) {
            if (chars[0] == chars[1]) {
                return Character.toString(chars[0]) + Character.toString(chars[1]);
            } else {
                return Character.toString(chars[0]);
            }
        }
        ArrayList<Character> characters = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        int l;
        String res = "";
        String endRes = "";
        for (int j = 3; j <= chars.length; j++) {
            for (int i = 0; i < j; i++) {
                characters.add(chars[i]);
            }
            ArrayList<Character> charactersRight = (ArrayList<Character>) characters.clone();
            ArrayList<Character> charactersLift = (ArrayList<Character>) characters.clone();
            String charRightAnalys = analysisMethod(charactersRight, "R");
            String charLeftAnalys = analysisMethod(charactersLift, "L");
            if (charLeftAnalys.length() >= charRightAnalys.length()) {
                res = charLeftAnalys;
                l = charLeftAnalys.length();
                integerArrayList.add(l);
            } else {
                res = charRightAnalys;
                l = charRightAnalys.length();
                integerArrayList.add(l);
            }
            results.add(res);
            characters.clear();
            res = "";
            charRightAnalys = "";
            charLeftAnalys = "";
        }
        ArrayList<Integer> integerArrayListIndex;
        integerArrayListIndex = (ArrayList<Integer>) integerArrayList.clone();
        Collections.sort(integerArrayListIndex);
        int value = integerArrayListIndex.get(integerArrayListIndex.size() - 1);
        int ind = integerArrayList.indexOf(value);
        endRes = results.get(ind);
        return endRes;
    }
    public String analysisMethod(ArrayList<Character> array, String C) {
        String res = "";
        boolean dobleMid = false;
        String doubleMidRes = "";
        while (array.size() >= 1) {
            if (array.size() == 1) {
                return array.get(0).toString();
            }
            if (array.size() == 2 & dobleMid == true) {
                return doubleMidRes;
            }
            if (array.size() == 2) {
                if (array.get(0) == array.get(1)) {
                    return array.get(0).toString() + array.get(1).toString();
                }
                if (array.get(0) != array.get(1)) {
                    return array.get(0).toString();
                }
            }
            if (array.size() > 2) {
                int mid;
                ArrayList<Character> leftArray = new ArrayList<>();
                ArrayList<Character> rightArray = new ArrayList<>();
                if ((array.size() - 1) % 2 == 0) {
                    mid = (array.size() - 1) / 2;
                    for (int i = 0; i < mid; i++) {
                        leftArray.add(array.get(i));
                    }
                    for (int i = array.size() - 1; i > mid; i--) {
                        rightArray.add(array.get(i));
                    }
                } else {
                    mid = array.size() / 2;
                    if (array.get(mid - 1) == array.get(mid)) {
                        doubleMidRes = array.get(mid - 1).toString() + array.get(mid).toString();
                        dobleMid = true;
                        for (int i = 0; i < mid - 1; i++) {
                            leftArray.add(array.get(i));
                        }
                        for (int i = array.size() - 1; i > mid; i--) {
                            rightArray.add(array.get(i));
                        }
                    } else {
                        leftArray.add(array.get(mid));
                        leftArray.add(array.get(mid - 1));
                    }
                }
                if (leftArray.equals(rightArray)) {
                    for (int i = 0; i < array.size(); i++) {
                        res = res + array.get(i).toString();
                    }
                    array.clear();
                    return res;
                } else {
                    leftArray.clear();
                    rightArray.clear();
                    if (C == "R") {
                        array.remove(array.size() - 1);
                    } else {
                        array.remove(0);
                    }
                }
            }
        }
        return res;
    }
}
//Time Limit Exceeded, BUT IT WORKING
class SolutionLongestPalindromicSubstringNewWithTestComment {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        if (chars.length > 1000 || chars.length == 0) {
            return "";
        }
        if (chars.length == 1) {
            return Character.toString(chars[0]);
        }
        if (chars.length == 2) {
            if (chars[0] == chars[1]) {
                return Character.toString(chars[0]) + Character.toString(chars[1]);
            } else {
                return Character.toString(chars[0]);
            }
        }

        System.out.print("chars: ");
        System.out.println(chars);
        ArrayList<Character> characters = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        int l;
        String res = "";
        String endRes = "";

        //int j=3;
        //while (j<=chars.length) {
        for (int j = 3; j <= chars.length; j++) {
            for (int i = 0; i < j; i++) {
                characters.add(chars[i]);
            }
            System.out.println(characters);
            ArrayList<Character> charactersRight = (ArrayList<Character>) characters.clone();
            System.out.println("cR " + charactersRight);
            ArrayList<Character> charactersLift = (ArrayList<Character>) characters.clone();
            System.out.println("cL " + charactersLift);

            String charRightAnalys = analysisMethod(charactersRight, "R");

            String charLeftAnalys = analysisMethod(charactersLift, "L");

            if (charLeftAnalys.length() >= charRightAnalys.length()) {
                res = charLeftAnalys;
                l = charLeftAnalys.length();
                integerArrayList.add(l);
            } else {
                res = charRightAnalys;
                l = charRightAnalys.length();
                integerArrayList.add(l);
            }
            results.add(res);
            characters.clear();
            res = "";
            //charactersRight.clear();
            //charactersLift.clear();
            charRightAnalys = "";
            charLeftAnalys = "";

            //j++;
        }
        System.out.print("End: ");
        System.out.println(results);
        ArrayList<Integer> integerArrayListIndex;
        integerArrayListIndex = (ArrayList<Integer>) integerArrayList.clone();
        Collections.sort(integerArrayListIndex);
        int value = integerArrayListIndex.get(integerArrayListIndex.size() - 1);
        int ind = integerArrayList.indexOf(value);
        endRes = results.get(ind);

        return endRes;
    }

    public String analysisMethod(ArrayList<Character> array, String C) {
        String res = "";
        boolean dobleMid = false;
        String doubleMidRes = "";


        while (array.size() >= 1) {
            if (array.size() == 1) {
                return array.get(0).toString();
            }
            if (array.size() == 2 & dobleMid == true) {
                //array.clear();
                return doubleMidRes;
            }
            if (array.size() == 2) {
                if (array.get(0) == array.get(1)) {
                    //array.clear();
                    return array.get(0).toString() + array.get(1).toString();
                }
                if (array.get(0) != array.get(1)) {
                    // array.clear();
                    return array.get(0).toString();
                }
            }

            if (array.size() > 2) {
                int mid;
                ArrayList<Character> leftArray = new ArrayList<>();
                ArrayList<Character> rightArray = new ArrayList<>();
                if ((array.size() - 1) % 2 == 0) {
                    mid = (array.size() - 1) / 2;
                    System.out.println("mid: " + mid + " char: " + array.get(mid));
                    for (int i = 0; i < mid; i++) {
                        leftArray.add(array.get(i));
                    }
                    System.out.println(leftArray);
                    for (int i = array.size() - 1; i > mid; i--) {
                        rightArray.add(array.get(i));
                    }
                    System.out.println(rightArray);
                } else {
                    mid = array.size() / 2;
                    System.out.println("double mid: " + (mid - 1) + " and " + mid + " char: " + array.get(mid - 1) + array.get(mid));

                    if (array.get(mid - 1) == array.get(mid)) {
                        doubleMidRes = array.get(mid - 1).toString() + array.get(mid).toString();
                        System.out.println("doubleMidRes: " + doubleMidRes);
                        dobleMid = true;

                        for (int i = 0; i < mid - 1; i++) {
                            leftArray.add(array.get(i));
                        }
                        System.out.println(leftArray);
                        for (int i = array.size() - 1; i > mid; i--) {
                            rightArray.add(array.get(i));
                        }
                        System.out.println(rightArray);
                    } else {
                        leftArray.add(array.get(mid));
                        leftArray.add(array.get(mid - 1));
                    }
                }

                if (leftArray.equals(rightArray)) {
                    System.out.println("equals");
                    for (int i = 0; i < array.size(); i++) {
                        res = res + array.get(i).toString();
                    }
                    System.out.println("res: " + res);
                    array.clear();
                    return res;

                } else {
                    System.out.println("Not equals");
                    leftArray.clear();
                    rightArray.clear();
                    if (C == "R") {
                        array.remove(array.size() - 1);
                    } else {
                        array.remove(0);
                    }
                    System.out.println("array NEW: " + array);
                }

            }
        }
        return res;
    }
}
