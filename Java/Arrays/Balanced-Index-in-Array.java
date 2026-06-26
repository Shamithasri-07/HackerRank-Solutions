import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int left=0,right=0,i,j;
        
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(i=0;i<n;i++){
            left=left+arr[i];
            right=0;
            
            for(j=i+2;j<n;j++){
                right=right+arr[j];
            }
            
        if(left==right){
            
            System.out.println(i+1);
            return;
        }
        }
        System.out.println(-1);
    }
}
