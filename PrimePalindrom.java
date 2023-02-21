package Logical;

import java.util.Scanner;

public class PrimePalindrom {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int n = scanner.nextInt();
        int sum = 0, rem;
        int temp = n;
        while(n > 0){
            rem = n % 10;
            sum = (sum * 10) + rem;
            n = n /10;
         }
        if(temp == sum){
        	System.out.println("Number is palindrom");
        	int count=0;            
            for(int i=2; i<temp; i++)
            {
               if(temp%i == 0)
               {
                  count++;
                  break;
               }
            }
            
            if(count==0)
               System.out.println("It is a Prime Number");
            else
               System.out.println("It is not a Prime Number");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }

}
