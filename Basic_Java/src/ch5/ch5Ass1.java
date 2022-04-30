package ch5;

import java.util.Scanner;

public class ch5Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] A=new int[101];
      
      for (int i = 0; i < A.length; i++) {
		 A[i]=i*i;
		
	}
      
      for (int i = 0; i < A.length; i++) {
    	  if(i%10==0) System.out.println();
		System.out.print(A[i]+"\t");
		
		
	}
	}

}
