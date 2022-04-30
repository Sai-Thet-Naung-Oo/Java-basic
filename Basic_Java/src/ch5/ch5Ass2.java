package ch5;

public class ch5Ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		String[] names= {"Susan","John","Marry"};
		int[][] module= {{70,50,100},{85,94,75},{74,69,98}};
		int total=0;
		
		System.out.println("Name\tModule1\tModule2\tModule3\tTotal");
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]+"\t");
			
			for (int j = 0; j < module.length; j++) {
				System.out.print(module[i][j]+"   "+"\t");
				total+=module[i][j];
			}
			System.out.println(total);
			total=0;
			
		}
		
		
		
	}

}
