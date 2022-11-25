package ZigzagConversion;


public class ZigzagConversion {
    public static void main(String[] args) {
        SolutionZigzagConversion solutionZigzagConversion = new SolutionZigzagConversion();
       /* String s1 = "abcdefghijklmno";
        int rows1 = 5;
        System.out.println(solutionZigzagConversion.convert(s1,rows1)); //aibhjcgkodflnem*/
       /* String s2 = "abc";
        int rows2 = 2;
        System.out.println(solutionZigzagConversion.convert(s2, rows2)); //acb*/
        /*String s3 = "PAYPALISHIRING";
        int rows3 = 3;
        System.out.println(solutionZigzagConversion.convert(s3, rows3)); //PAHNAPLSIIGYIR*/
        /*String s4 ="PAYPALISHIRING";
        int rows4 = 4;
        System.out.println(solutionZigzagConversion.convert(s4,rows4)); //PINALSIGYAHRPI*/
       String s5 ="abcde";
        int rows5 = 3;
        System.out.println(solutionZigzagConversion.convert(s5,rows5));
    }
}

class SolutionZigzagConversion {
    public String convert(String s, int numRows) {
        String result = "";
        if (s.length() > 0 && s.length() < 1001 && numRows > 0 && numRows < 1001) {
            if (s.length() < 3) {
                 System.out.println("I");
                return s;
            }
            /*if (s.length() == 3 && numRows ==2 ) {
                 System.out.println("II-");
                char[] chars = s.toCharArray();
                return Character.toString(chars[0]) + Character.toString(chars[2]) + Character.toString(chars[1]);
            }*/
            if (numRows==2){
                System.out.println("II-");
                String a = "";
                String b = "";
                char[] chars = s.toCharArray();
                for (int i =0; i<s.length(); i=i+2){
                    a=a+Character.toString(chars[i]);
                }
                for (int j=1; j<s.length();j=j+2){
                    b = b + Character.toString(chars[j]);
                }
                return a+b;
            }
            if ((s.length() == 3 && numRows >= 3 || numRows==1)) {
                 System.out.println("II+");
                char[] chars = s.toCharArray();
                return s;
            }
            //if (numRows >= 3 && s.length() > 3) {
            if ( s.length() > 3) {
                // System.out.println("III");
                char[][] array = new char[(s.length()/ 2)+numRows-2][numRows];
                //System.out.println(Arrays.deepToString(array));
                int z = numRows - 2;
                int count = 0;
                int pak = 0;
                int pak1 = 1;
                int pak2 = 0;
                int a;
                int b;
                char[] chars = s.toCharArray();
                int index = 0;
                for (int i = 0; i < chars.length; i++) {
                    if (index < numRows || index % (numRows + z) == 0) {
                        int x = pak;
                        try {
                            for (int j = 0; j < numRows; j++) {
                                a = x;
                                b = count;
                                array[a][b] = chars[index];
                                index++;
                                count++;
                                i++;
                            }
                        } catch (Exception e) {
                            break;
                        }
                    }
                    if (count == numRows) {
                        count = 0;
                        pak++;
                        pak2++;
                    }
                    if (index >= numRows * pak2 && index < (numRows + z) * pak2) {
                        try {
                            a = pak;
                            b = numRows - 1 - pak1;
                            pak++;
                            pak1++;
                            array[a][b] = chars[index];
                            index++;
                        } catch (Exception e) {
                            break;
                        }
                    }
                    if (pak1 + 1 == numRows) {
                        pak1 = 1;
                    }
                }
                //System.out.println(Arrays.deepToString(array));
                for (int i = 0; i < numRows + z; i++) {
                    for (int j = 0; j < s.length(); j++) {
                        try {
                            if (array[j][i] != '\u0000') {
                                result = result + Character.toString(array[j][i]);
                            }
                        } catch (Exception e) {
                            break;
                        }
                    }
                }
              //  System.out.println(result);
            }
        }
        return result;
    }
}