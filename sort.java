


//write a java program to accept 5 string from the user and print them in lexicographical order

import java.util.*;
public class sort {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        String arr[]= new String[5];
        System.out.println("Enter the string: ");
        //taking string input from user
        for(int i=0;i<5;i++){
           arr[i] = sc.nextLine().toLowerCase();
        }
        //sorting the string
        Arrays.sort(arr);
        for(int a=0;a<5;a++){
        System.out.println(arr[a]);
    }
}
}
