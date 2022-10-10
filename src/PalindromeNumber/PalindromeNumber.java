package PalindromeNumber;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 1000021;
        SolutiontestPalindromeNumber solutionSolutiontestPalindromeNumber = new SolutiontestPalindromeNumber();
        System.out.println(solutionSolutiontestPalindromeNumber.isPalindrome(x));
    }
}
class SolutiontestPalindromeNumber {
    public boolean isPalindrome(int x) {
        boolean b = false;
        // char[] chars1 = ("" + x).toCharArray();
        char[] chars = String.valueOf(x).toCharArray();
        if (chars.length < 2) {
            b = true;
        }
        if (chars.length == 2) {
            //System.out.println("I");
            if (chars[0] == chars[1]) {
                b = true;
            }
        }
        if (chars.length > 2) {
            if (chars.length % 2 != 0) {
               // System.out.println("II");
                //System.out.println("length: "+chars.length / 2);
                try {
                    for (int i = 0; i <= chars.length / 2; i++) {
                       // System.out.println("----");
                        if (chars[chars.length / 2 - 1 - i] != chars[chars.length / 2 + 1 + i]) {
                            //System.out.println("l: " + chars[chars.length / 2 - 1 - i]);
                            //System.out.println("r: " + chars[(chars.length / 2) + 1 + i]);
                            b=false;
                            return b;
                        } else {
                           // System.out.println("l: " + chars[chars.length / 2 - 1 - i]);
                          //  System.out.println("r: " + chars[(chars.length / 2) + 1 + i]);
                            b = true;
                        }
                    }
                } catch (Exception e) {
                }
            }
            if (chars.length % 2 == 0) {
               // System.out.println("III");
               // System.out.println("length: "+chars.length / 2);
                try {
                    for (int i = 0; i <= chars.length / 2; i++) {
                       // System.out.println("----");
                        if (chars[(chars.length / 2) - 1 - i] != chars[chars.length / 2 + i]) {
                          //  System.out.println("l: " + chars[chars.length / 2 - 1 - i]);
                           // System.out.println("r: " + chars[chars.length / 2  + i]);
                            b=false;
                            return b;
                        } else {
                          //  System.out.println("l: " + chars[chars.length / 2 - 1 - i]);
                           // System.out.println( "r: " + chars[chars.length / 2  + i]);
                            b = true;
                        }
                    }
                } catch (Exception e) {
                }
            }
        }
        return b;
    }
}