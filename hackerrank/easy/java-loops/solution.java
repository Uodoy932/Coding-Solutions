import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        
        int t = s.nextInt();
        
        
        for (int i = 0; i < t; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int n = s.nextInt();
            
            int result = a;
            
            
            for (int j = 0 ; j < n ; j++) 
            {
                
            result += Math.pow(2, j) * b ;
            System.out.print(result+ " ");
            
            }    
            
            System.out.println();
        }
        
        s.close();
    }
}
