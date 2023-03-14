package mypractice1;

import java.util.Scanner;

public class Febonacci {
	
public void	febonacchi(int input) {
	int num1=0, num2=1,num3;
	
	System.out.println(num1+" "+num2);
	
	for(int i=2;i<input;i++) {
		
		num3=num1+num2;
		System.out.println(" "+num3);
		num1=num2;
		num2=num3;
	}
	
}
	
	

	public static void main(String[] args) {
		Febonacci ob=new Febonacci();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the input");
		int input=sc.nextInt();
		ob.febonacchi(input);
	}
}
