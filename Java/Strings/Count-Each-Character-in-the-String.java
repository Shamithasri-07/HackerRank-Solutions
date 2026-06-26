import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int arr[] = new int[26];

        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i)!=' ')
            arr[s.charAt(i)-'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            
            if(arr[s.charAt(i)-'a'] != 0){
                System.out.println(s.charAt(i) + " " + arr[s.charAt(i)-'a']);
                arr[s.charAt(i)-'a'] = 0;   
            }
        }
    }
}
