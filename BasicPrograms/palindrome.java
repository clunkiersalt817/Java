package BasicPrograms;

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        String str = "";
        String revstr = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string : ");
        str=s.next();
        int len=str.length();
        System.out.println(len);
        for(int i=len-1;i>=0;i--){
            revstr=revstr+str.charAt(i);
        }
        System.out.println(revstr);
    }
}