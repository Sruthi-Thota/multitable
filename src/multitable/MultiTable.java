
package multitable;


import java.util.Scanner;
public class MultiTable {

    public static void main(String[] args) {
        
     
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=s.nextInt();
        for(int i=1;i<=10;i++)
        {
           System.out.println(num+" * "+i+" = "+num*i);
        }
            System.out.println();
            
        }
    }
    

