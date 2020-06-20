import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
       int len=arr.length;
        float positiveCount=0;
        float negativeCount=0;
        float zeroCount=0;

        for(int i=0;i<len;i++)
        {
            int element=arr[i];
            if(element>0)
            {
                positiveCount++;    // positiveCount=positiveCount+1;
            }
            if(element<0)
            {
                negativeCount++;    //negativeCount=negativeCount++;
            }
            if(element==0)
            {
               zeroCount++;  //  zeroCount=zeroCount++;
            }
        }
        System.out.printf("%1.6f\n",positiveCount/len);

        System.out.printf("%1.6f\n",negativeCount/len);

        System.out.printf("%1.6f\n",zeroCount/len);

    }


    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
