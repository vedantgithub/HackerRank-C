import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] sArray = new String[n];

        for(int i=0;i<n;i++)
        {
            sArray[i]=sc.nextLine();

        }
        for(int i=0;i<n;i++)
        {
            char[] arr = sArray[i].toCharArray();
            for(int e=0;e<arr.length;e+=2)
            {
                System.out.print(arr[e]);
            }
            System.out.print(" ");
            for(int o=1; o<arr.length;o+=2)
            {
                System.out.print(arr[o]);
            }
            System.out.println();
        }
            }
}
