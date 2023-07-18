
//design a java code to print a pyramid based on level entered by the user
//half pyramid

import java.util.*;

public class pyramid {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the level of the pyramid:");
        n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++){
                System.out.print("*");
                }
                System.out.println();

            }
        }
    }



