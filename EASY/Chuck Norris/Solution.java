import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static String returnASCII(char caractere){
	    StringBuilder binary = new StringBuilder();
	    int valeurInt = (int)caractere;
		String binaryString = Integer.toBinaryString(valeurInt);
		for (int i=binaryString.length(); i < 7;i++) {
			binary.append("0");
		}
		binary.append(binaryString);
		return binary.toString();
	}
    
    public static void main(String args[]) throws UnsupportedEncodingException  {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();

System.err.println("Le mot a chercher >>" + MESSAGE );
        String bin = "";
      /*  for (byte b : MESSAGE.getBytes("UTF-8")) {
            //System.err.println("b" + b);
            bin += Integer.toBinaryString(b);
            
        }*/
for (int i = 0 ; i < MESSAGE.length() ;i++) {
            bin += returnASCII(MESSAGE.charAt(i));
        }
        
        System.err.println("Le binaire " + bin);
        //System.err.println(String.format("%16s", Integer.toBinaryString(bin)).replace(' ', '0'));
        
        String aff = "";
        for (int i = 0; i < bin.length();) {
//            System.err.println("A");
            if ('0' == bin.charAt(i)) {
//                System.err.println("0");
                aff += " 00 ";
                i++;
                if (i < bin.length() && bin.charAt(i) != '0') {
//                    System.err.println("1 seule 0");
                    aff += "0";
                    
                } else {
                    aff += "0";
                    while (i < bin.length() && '0' == bin.charAt(i)) {
//                        System.err.println("suite 0");
                        aff += "0";
                        i++;
                    }
                }
            } else {
//                System.err.println("1");
                aff += " 0 ";
                i++;
                if (i < bin.length() && bin.charAt(i) != '1') {
//                    System.err.println("1 seule 1");
                    aff += "0";
                  
                } else {
                    aff += "0";
                    while (i < bin.length() && '1' == bin.charAt(i)) {
//                        System.err.println("suite 1");
                        aff += "0";
                        i++;
                    }
                }

            }
        }
        System.out.println(aff.trim());
    
    
    }
}
