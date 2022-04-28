package ch4;

import java.util.Scanner;

public class ch4Ass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int ntime;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter N time:");
		ntime=scanner.nextInt();
		
		for (int i = ntime; i >=0; i--) {
			System.out.print(" "+(int)Math.pow(i, 2));
			
		}
	}

}
