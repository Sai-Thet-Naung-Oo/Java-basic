package ch10_Eg1;

public class Box extends Rectangle {
	int depth;
	public Box(int w,int l,int d) {
		// TODO Auto-generated constructor stub
		super(w, l);
		this.depth=d;
	}
	public int  getVolume() {
		int pro=super.calculateArea();
		return pro*this.depth;
	}

}
