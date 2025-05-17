//create a main class to input 10 integers from user input and 
//find the sum of the 10 integers

import java.util.Scanner;
class Sum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int num=0;
		int sum=0;
		
		System.out.println("Enter 10 numbers");
		try{
		for(int i=1;i<=10;i++){
			num=sc.nextInt();
			sum=sum+num;
		}
		num=Integer.parseInt(args[0]);}
		catch(Exception e){
			System.out.println("An error occured!");
			System.out.println("The error is "+e.getMessage());
		}
		System.out.println("Sum of the 10 numbers is "+sum );
	}
}