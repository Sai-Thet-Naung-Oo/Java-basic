import java.util.Scanner;

public class ch3Ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
	
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Character(y/n):");
		ch= scanner.next().charAt(0);   
	  
		switch(ch) {
		case 'y':System.out.println("Yes");break;
		case 'n':System.out.println("No");break;
		default:System.out.println("Unknown response");
		
		}

	}

}
