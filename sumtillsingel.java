
//write a java program to take 2 digit input from user and add the corresponding once and tens placed numbers till it becomes a single digit number

import java.util.*;
public class Digit{
    public static void calc(int num) {
        int sum=0;
        while(num>0 || sum>9)
        {
            if(num==0)
            {
                num = sum;
                sum=0;
            }
            sum+=num%10;
            num/=10;
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        calc(n);
    }
} 
