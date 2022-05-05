package exam;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count,count2=0;
		for (int i = 2; i <= 1000; i++) {
			count=0;
			for (int j = i; j>=1; j--) {
				
				if(i%j==0)
					count++;
				
			}
			
			if(count==2)
			{
				System.out.print(i+"  ");
			   count2++;
			   
			   if(count2%10==0) {
					System.out.println();
					
				}
			}
			
			
				
				
			
		}

	}

}
