import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String lower=s.toLowerCase();
        String s2=sc.nextLine();
        String lower2=s2.toLowerCase();
        int[] arr=new int[26];
        int[] arr2=new int[26];
        int i;
        
        for(i=0;i<lower.length();i++){
            
            arr[lower.charAt(i)-'a']++;
        }
        
        for(i=0;i<lower2.length();i++){
            
            arr2[lower2.charAt(i)-'a']++;
        }
        
        for(i=0;i<26;i++){
                
                if(arr[i] != arr2[i]){
                System.out.println(s + " and " + s2 +" are Not Anagrams.");
                return;
                    
            }  
        }
            
        System.out.println(s + " and " + s2 +" are Anagrams.");        
    }
}
