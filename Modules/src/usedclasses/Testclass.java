package usedclasses;

import java.util.Scanner;

public class Testclass {
	
 public static void main(String[] args)
{
	int n1,n2;
	System.out.println("Enter number one and number two");
	Scanner input=new Scanner(System.in);
	n1=input.nextInt();
	n2=input.nextInt();
	addition add=new addition(n1,n2);
        add.setN1(20);
        add.setN2(9);
       multiplication mult=new multiplication(n1,n2);
	System.out.println("The summation of entered numbers is : "+add.summation());
        System.out.println("The product of entered numbers is : "+mult.product());
}
}
