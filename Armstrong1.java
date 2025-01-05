package com.practice.programming;

public class Armstrong1 {
	static int power(int base,int ex) {
		int pow=1;
		for(int i=1;i<=ex;i++) {
			pow=pow*base;
		}
		return pow;
	}
	static int countOfDigits(int n) {
		int c=0;
		while(n!=0) {
			n=n/10;
			c++;
		}
		return c;
	}
	public static void main(String[] args) {
		int n=153,n1=n;
		int sum=0,rem=0;
		int ex=countOfDigits(n);
		while(n!=0) {
			rem=n%10;
			sum=sum+power(rem,ex);
			n=n/10;
		}
		System.out.println(sum==n1? "Armstrong Number" :"Not an Armstrong Number");
	}
}
