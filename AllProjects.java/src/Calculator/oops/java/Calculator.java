package Calculator.oops.java;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("---CALCULATOR---");
        System.out.println("enter 2 number");
        int n1,n2,cal,ch;
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println("Set operation");
        ch=sc.nextInt();
        
        if(ch==1)
        {
        	cal=n1+n2;
        	System.out.println(cal);
        }
        else if(ch==2)
        {
        	cal=n1-n2;
        	System.out.println(cal);
        }
        else if(ch==3)
        {
        	cal=n1*n2;
        	System.out.println(cal);
        }
        else if(ch==4)
        {
        	cal=n1/n2;
        	System.out.println(cal);
        }
        else
        {
        	cal=n1%n2;
        	System.out.println(cal);
        }
        
        
   
	}

}
