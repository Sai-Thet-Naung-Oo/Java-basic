package ch10Ass1;



public class Main {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GraduateStudent g[]=new GraduateStudent[3];
		g[0]=new GraduateStudent(10,"mg mg",'A');
		g[1]=new GraduateStudent(11,"Sai Thet",'B');
		g[2]=new GraduateStudent(12,"U Bo",'C');
		
		for (int i = 0; i < g.length; i++) {
			
			System.out.println("Student Number:"+g[i].StudentNo);
			System.out.println("Student Name:"+g[i].Name);
			System.out.println("Student Credit:"+g[i].credit);
			System.out.println("********---------------**************");
			
		}
	
	}

}
