import java.util.*;
class Sum2{
	public static void main(String[] args){
		
		
		int sum=0;
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<10;i++){
			
			System.out.println("Enter number "+(i+1));
			try{
			sum+=Integer.parseInt(sc.nextLine());
			}
			catch(Exception e){
		
			System.out.println(e.getMessage());
			i=i-1;
		    }
		}
		
		
		
		System.out.println("Sum is "+sum );
	}
	
}