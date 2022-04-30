package ch6;

public class ch6Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] salary=new int[5];
		
		for (int i = 0; i < salary.length; i++) {
			salary[i]=(int)(Math.random()*3000);
			}
		
		 caculateAverageSalary(salary);
		

	}
	
	public static void caculateAverageSalary(int[] s) {
		 int sum=0;
		for (int i = 0; i < s.length; i++) {
			 sum+= s[i];
			
		}
		System.out.println("Average Salary : "+sum/s.length);
		
	}

}
