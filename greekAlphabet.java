import java.util.*;
import java.io.*;
import java.nio.charset.Charset;
import java.io.UnsupportedEncodingException;

public class greekAlphabet {
    // Checks to see if the input is an upper case letter.
    // returns 1 if true, 0 if false.
    public static int isUpper_greek(int wc) {
        if(wc >= 0x391 && wc <= 0x3A9)      return 1;
        else                                return 0;
    }
    // Checks to see if the input is an lower case letter.
    // returns 1 if true; 0 if false.
    public static int isLower_greek(int wc) {
        if(wc >= 0x3B1 && wc <= 0x3C9)      return 1;
        else                                return 0;
    }
    // Converts input decimal into hex
    // helper function for below implementations.
    public static String dec2Hex(int decimal){
        int temp;
        String hex = "";
        char hexChars[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(decimal > 0) {
            temp = decimal % 16;
            hex = hexChars[temp] + hex;
            decimal = decimal/16;
        }
        return hex;
    }
    // converts upper case greek letter to lower case Greek letter.
    public static String toLower_greek(int wc) {
        int num = wc + 32;
        String str = Character.toString((char)num);
        return str;
    } 
    // converts lower case greek letter to upper case Greek letter.
    public static String toUpper_greek(int wc) {
        int num = wc - 32;
        String str = Character.toString((char)num);
        return str;
    }

    // Driver function
    public static void main(String args[]) {
        for(int wc=0x0391; wc<=0x03C9; wc++) {
            if(wc >= 0x3AA && wc <= 0x3B0) {
                continue;
            }
            if (wc == 0x3A2) {
                continue;
            }
            if (isUpper_greek(wc) == 1) {
                System.out.println("U+0" + wc + " is " + (char) wc + " : uppercase, lower case form: " + toLower_greek(wc));
            }
            if (isLower_greek(wc) == 1) {
                System.out.println("U+0" + wc + " is " + (char) wc + " : lowercase, upper case form: " + toUpper_greek(wc));
            }
        }
    }

}
