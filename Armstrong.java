//Check Armstrong Number between Two Integers

import java.util.Scanner;
public class Armstrong
 {
   public static void main(String args[])
{
      int num1, num2;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the first number :");
      num1 = sc.nextInt();
      System.out.print("Enter the second number :");
      num2 = sc.nextInt();

      for (int i = num1; i<num2; i++){
         int check, rem, sum = 0;
         check = i;
         while(check != 0) {
            rem = check % 10;
            sum = sum + (rem * rem * rem);
            check = check / 10;
         }
         if(sum == i){
            System.out.println(""+i+" is an Armstrong number");
         }
      }
   }
}