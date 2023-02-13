package mypractice1;

import java.util.Scanner;

public class ReverseString {
	
	public void getreverse(String input) {
		char ch[]=input.toCharArray();
		String out="";
		for(int i=ch.length-1;i>=0;i--) {
			
			out=out+ch[i];
			
		}
		System.out.println(out);
	}

	public static void main(String[] args) {
		ReverseString ob = new ReverseString();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the input: ");
		String input=sc.next();
		ob.getreverse(input);
			
		

	}

}
