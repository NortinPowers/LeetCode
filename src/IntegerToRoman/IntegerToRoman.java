package IntegerToRoman;

public class IntegerToRoman {
    public static void main(String[] args) {
        SolutionIntegerToRoman solutionIntegerToRoman = new SolutionIntegerToRoman();
        int i1 = 3;
        System.out.println(solutionIntegerToRoman.intToRoman(i1)); //III
        int i2 =58;
        System.out.println(solutionIntegerToRoman.intToRoman(i2)); //LVIII
        int i3 =1994;
        System.out.println(solutionIntegerToRoman.intToRoman(i3)); //MCMXCIV
        int i4 =3999;
        System.out.println(solutionIntegerToRoman.intToRoman(i4)); //MMMCMXCIX
        int i5 =542;
        System.out.println(solutionIntegerToRoman.intToRoman(i5)); //DXLII
        int i6 =0;
        System.out.println(solutionIntegerToRoman.intToRoman(i6)); // ""

    }
}

class SolutionIntegerToRoman {
    public String intToRoman(int num) {
        if (num < 1 || num > 3999) {
            return "";
        }
        String result = "";
        while (num >= 1000) {
            num = num - 1000;
            result = result + "M";
        }
        while (num >= 900) {
            num = num - 900;
            result = result + "CM";
        }
        while (num >= 500) {
            num = num - 500;
            result = result + "D";
        }
        while (num>=400){
            num = num - 400;
            result = result + "CD";
        }
        while (num >= 100) {
            num = num - 100;
            result = result + "C";
        }
        while (num >= 90) {
            num = num - 90;
            result = result + "XC";
        }
        while (num >= 50) {
            num = num - 50;
            result = result + "L";
        }
        while (num>=40){
            num=num-40;
            result=result+"XL";
        }
        while (num >= 10) {
            num = num - 10;
            result = result + "X";
        }
        while (num >= 9) {
            num = num - 9;
            result = result + "IX";
        }
        while (num >= 5) {
            num = num - 5;
            result = result + "V";
        }
        while (num >= 4) {
            num = num - 4;
            result = result + "IV";
        }
        while (num > 0) {
            num = num - 1;
            result = result + "I";
        }
        return result;
    }
}
