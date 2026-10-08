import java.io.*;
import java.util.*;

public class Solution {
    static int a;
    static int b;
    static boolean flag;
    
    static{
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();
        
        if(a > 0 && b > 0){
            flag = true;
        } else {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
       
        if(flag){
            System.out.println(a*b);
        }
    }
}
