//Article link : https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        char[] try1 = str.toCharArray();
        String s = "";
 
        for (int i = try1.length - 1; i >= 0; i--)
            // System.out.print(try1[i]);
            s += try1[i];
        return s;
    }
}