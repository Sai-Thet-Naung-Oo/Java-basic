package ch9;

public class Time {

  int hour,min,sec;
  
  public Time() {
	  this.hour=0;
	  this.min=0;
	  this.sec=0;
  }
  
  public Time(int h,int m,int s) {
	  this.hour=h;
	  this.min=m;
	  this.sec=s;
  }
  
  public void display() {
	  System.out.println("Time:  "+this.hour+"h:"+this.min+"m:"+this.sec+"s");
	
}
  
  public void add(Time t1,Time t2) {
	  this.hour=t1.hour+t2.hour;
	  this.min=t1.min+t2.min;
	  this.sec=t1.sec+t2.sec;
	  
	  if(this.sec>=60) {
		  this.min+=this.sec/60;
		  this.sec%=60;
	  }
	  
	  if(this.min>=60) {
		  this.hour+=this.min/60;
		  this.min%=60;
	  }
	  
	 
}
}
