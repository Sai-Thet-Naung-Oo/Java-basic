import java.util.Scanner;

public class ch3Ass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Number to determine(Positive,Negative and zero):");
		num=scanner.nextInt();
		
		if(num>0) System.out.println("Positive Number");
		else if(num<0) System.out.println("Negative Number");
		else if(num==0)System.out.println("Zero");
			
	
	}

}
