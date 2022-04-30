import java.util.Scanner;

public class ch3Ass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Number 1:");
		a=scanner.nextInt();
		System.out.print("Enter Number 2:");
		b=scanner.nextInt();
		System.out.print("Enter Number 3:");
		c=scanner.nextInt();
		
			    int temp;

			    if (a>b) {
			      temp = a;
			      a = b;
			      b = temp;
			    }

			    if (b>c) {
			      temp = b;
			      b = c;
			      c = temp;
			    }

			    if (a>b) {
			      temp = a;
			      a = b;
			      b = temp;
			    }

			    System.out.println("Ascending : "+a+" "+b+" "+c);
			    System.out.println("Descending: "+c+" "+b+" "+a);
			   
			

	}

}
