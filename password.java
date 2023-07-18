
//design a java code which accepts a room number, mobile no and name of the customer and generate a 6 character unoque password

import java.util.*;
public class password {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name;
        String pw=new String();
        long ph;
        int rno,rem,sum=0;

        System.out.println("Enter the name of the customer :");
        name = sc.next();
        System.out.println("Enter the room number :");
        rno = sc.nextInt();
        int rno1=rno;
        System.out.println("Enter the mobile number :");
        ph = sc.nextLong();
    
        //System.out.println(r+m+n);
        char []sym={')','!','@','@','#','$','%',',','^','*','('};

        do{
            while(rno!=0){
                rem=rno%10;
                sum=sum+rem;
                rno=rno/10;
            }
            if(sum>=10)
            {
                rno=sum;
                sum=0;
            }
        }
        while(rno!=0);

        int c=rno1/100;
        int len=name.length();
        int pos=0;
        for(int i=0;i<len;i++)
        {
            if(c==i){
                pos=i;
                System.out.println("Password is:");
            }
        }
        pw=""+name.charAt(0)+(ph%10)+sum+sym[c]+name.charAt(len-1);
        System.out.println(pw);
    }
}

