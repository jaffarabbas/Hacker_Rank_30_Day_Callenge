import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

 public class day_5{
     
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i = n;i<=n;i++){
            for(int j = 1;j<=10;j++){
                int result = n*j;
            System.out.printf("%d x %d = %d\n",i,j,result);
        }
        System.out.println("");
        }
        scanner.close();
    }
}
