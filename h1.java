
/*super keyword in java is a refrence variable which is used to refor to immediate parent class, whenever you create the instance of suv class an instance 
of parent class is created implicitly which is reffered by super reference variable */




import java.util.*;
public class h1{
   public static void main(String args[])
   {
        int m,n,i,j;

       Scanner  input = new Scanner(System.in);

        System.out.println("Enter the number of rows in the matrix");
        m = input.nextInt();

        System.out.println("Enter the number of columns");
        n = input.nextInt();

        int first[][] = new int[m][n];
    System.out.println("Enter the element of the matrix");
    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            System.out.print(first[i][j]+" ");
            System.out.println();
        }
    }

   }
}







