package ch5;

import java.util.Scanner;

public class ch4_While {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int num,sum,max,min,avg,count;
		sum=0;count=0;
		
        Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Number for sum or Enter 0 to Exit:");
		num=scanner.nextInt();
		max=min=num;
		
         while(num!=0) {
      
			sum+=num;
			count++;
			
			if(num>max) max=num; //maximum
			if(num<min) min=num; //minimum
		  
			System.out.print("Enter Number for sum or Enter 0 to Exit:");
			num=scanner.nextInt();
			
		}
         avg=sum/count;
         System.out.println();
         System.out.println("Total Sum: "+sum);
         System.out.println("Avgerage: "+avg);
         System.out.println("Maximum number: "+max);
         System.out.println("Minimum number: "+min);

	}

}
