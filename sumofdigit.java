
//to find the sum of digits of entered number

import java.util.*;
public class sumofdigit 
  
    {  
    public static void main(String args[])  
    {  
    int number, digit,sum1,sum = 0;  
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter the number: ");  
    number = sc.nextInt();  
    while(number > 0)  
    {  
    //finds the last digit of the given number    
    digit = number % 10;  
    //adds last digit to the variable sum  
    sum = sum + digit;  
    //removes the last digit from the number  
    number = number / 10;  
    }  
    //prints the result  
     int temp;
     sum1=sum%10;
    temp=sum1;
    sum=sum/10;
    System.out.print(sum);
   
  
     sum= sum+temp;
    System.out.println("Sum of Digits: "+sum);  
    }  
    }  

