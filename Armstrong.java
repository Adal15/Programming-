package com.practice.programming;

public class Armstrong {
	public static void main(String[] args) {
		int n=13;
		int temp=n;
		int rem,sum=0;
		while(n>0) {
			rem=n%10;
			n=n/10;
			sum=sum+r*r*r;
		}
		if(temp==sum)
			System.out.println("armstrong number");
		else
			 System.out.println("Not an armstrong number");
	}
}
