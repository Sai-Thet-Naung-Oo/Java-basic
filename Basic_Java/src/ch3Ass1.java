import java.util.Scanner;

public class ch3Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Number To determine even or odd:");
		num=scanner.nextInt();
		if(num%2==0) {System.out.println("Even Number");}
		else System.out.println("Odd Number");
  
	}

}
