package ATM.oops.java;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	int atmnumber=12345;
	int atmpin=123;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Atm Number :");
	int atmNumber=sc.nextInt();
	System.out.println("Enter Pin :");
	int pin=sc.nextInt();
	if((atmNumber==atmnumber)&&(atmpin==pin))
	{
		while(true) {
			System.out.println("1.View Avalilable balance \n 2.withdraw Amount\n 3.Deposit amount\n 4.View ministatement\n 5.Exit");
			System.out.println("Enter choice:");
			int ch=sc.nextInt();
			if(ch==1) {
				
			}
			else if(ch==2) {
				
			}
            else if(ch==3) {
				
			}
            else if(ch==4) {
				
			}
            else if(ch==5){
             System.out.println("collect your ATM Card \n Thank you for using ATM Machine!!");	
            }
            else
            {
            	System.out.println("Please enter correct choice:");
            }
		}
	}
	else {
		System.out.println("Incorrect Atm Number or pin");
	}
}
}
