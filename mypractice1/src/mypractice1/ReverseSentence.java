package mypractice1;

import java.util.Scanner;

public class ReverseSentence {
	
	public void reversesentence(String input) {
		
		String st[]=input.split(" ");
		String out="";
		for (int i=0;i<st.length;i++) {
			
			char ch[]=st[i].toCharArray();
			
			for(int j=ch.length-1;j>=0;j--) {
				
				out=out+ch[j];
			}
			out=out+" ";
		}
		System.out.println(out);
	}
	public static void main(String[] args) {
		
		ReverseSentence ob=new ReverseSentence();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the input:");
		String input=sc.nextLine();
		ob.reversesentence(input);
	}

}
