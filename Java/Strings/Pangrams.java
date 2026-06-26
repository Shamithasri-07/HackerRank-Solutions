import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] arr=new int[26];
        String s1=s.toLowerCase();
        
        for(int i=0;i<s1.length();i++){
            
            if(Character.isLowerCase(s1.charAt(i)))
            arr[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            
            if(arr[i]==0){
                System.out.println("Not Pangrams");
                return;
            }
        }        
        System.out.println("Pangrams");        
    }
}
