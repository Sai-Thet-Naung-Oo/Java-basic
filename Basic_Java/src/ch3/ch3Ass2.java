import java.util.Scanner;

public class ch3Ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int speed;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Speed:");
		speed=scanner.nextInt();
		
		int ticket=(speed>55)?1:0;
		System.out.println("ticket : "+ticket);
	}

}
