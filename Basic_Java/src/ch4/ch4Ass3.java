package ch4;

public class ch4Ass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//   int i=2,t=0;
//   while(i<100) {
//	   i+=3;
//	   if(i%5==0)
//		   t+=i;
//	   
//   }
		
int sum=0;	
   for (int i = 2; i < 100; i+=3) {
		
	    if(i%5==0)
		   sum+=i;	
	}
   
   
     System.out.println(sum);
	}

}
