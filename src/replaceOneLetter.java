
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Esha
 */
public class replaceOneLetter {

    public static String replaceALetter(String toWorkOn, char letterToFind, char letterToReplaceWith) {
        String find = letterToFind + "";
        String replace = letterToReplaceWith + "";

        String result = "";

        for (int i = 0; i < toWorkOn.length(); i++) {
            if (toWorkOn.substring(i, i + 1).equals(find)) {
                result = result + replace;
            } else {
                result = result + toWorkOn.substring(i, i + 1);
            }
        }
        return result;
    }

    public static String replace(String str, char originalChar, char replacementChar) {
        String newString = ""; // start with an empty string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == originalChar) {
                newString = newString + replacementChar;
            } else {
                newString = newString + str.charAt(i);
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        String Esha = "Esha Massand";
        System.out.println(replace(Esha, 's', 't'));
        System.out.println(replaceALetter(Esha, 's', 't'));

        ArrayList al = new ArrayList();
        ArrayList alal = new ArrayList();
        String str1 = "String 1";
        String str2 = "String 2";
        String str3 = "String 3";

        al.add(str1);
//        alal.add(al);
        al.add(str2);
        al.add(str3);
        //System.out.println(al);
//        System.out.println(al);
//        System.out.println(alal);
//
//        al.clear();
//        System.out.println(alal);

        al.add(str1);
        alal.add(al);
        al.clear();
        al.add(str2);
        alal.add(str3);
        al.add(str3);
        alal.add(al);
        al.add(str1);
        alal.add(al);
        for (Object arrays : alal) {
            System.out.println("//");
            System.out.println(arrays);
        }

       // System.out.println(al);
        //System.out.println(alal);
//       
    }
}
