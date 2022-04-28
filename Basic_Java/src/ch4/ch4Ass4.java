package ch4;

import java.util.Scanner;

public class ch4Ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int even=0,odd=0,sum=0,avg=0,min=0,max=0,num,ntime;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter N time:");
		ntime=scanner.nextInt();
		
		System.out.print("Enter first time in Number:");
		max=min=sum=num=scanner.nextInt();
		
		if(num%2==0) even++; //count even number
		else odd++;   		 //count odd number
		 
		
		for (int i = 2; i <= ntime; i++) {
			
			System.out.print("Enter "+(i)+" time in Number:");
			num=scanner.nextInt();
			
			if(num>max) max=num; //maximum
			if(num<min) min=num; //minimum
			
			if(num%2==0) even++; //count even number
			else odd++;   		 //count odd number
			 
			sum+=num;			 //total sum
			
		}
		avg=sum/ntime;			//avgerage
		
		System.out.println("\nMaximum :"+max);
		System.out.println("Manimum :"+min);
		System.out.println("Even count :"+even);
		System.out.println("Odd count :"+odd);
		System.out.println("Total Sum :"+sum);
		System.out.println("Avegrage :"+avg);
		
	}

}
