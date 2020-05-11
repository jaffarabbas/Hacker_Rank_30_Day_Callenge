import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day_6{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        for(int i =1 ; i<=t;i++){
            String b = obj.next();
            for(int j =0;j<b.length();j++){
               if(j %2==0 )System.out.print(b.charAt(j));
            }   
              System.out.print(" ");
            for(int j =0;j<b.length();j++){
                if(j %2!=0 )System.out.print(b.charAt(j));
            }  
            System.out.println();
        }  
    }
}