import java.util.Scanner;

public class ch2Ex2Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,sex;
		int mark;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter name:");
		name=scanner.nextLine();
		System.out.print("Enter sex:");
		sex=scanner.nextLine();
		System.out.print("Enter mark:");
		mark=scanner.nextInt();
		
		System.out.println("\nName:"+name);
		System.out.println("Sex:"+sex);
		System.out.println("Mark:"+mark);
		

	}

}
