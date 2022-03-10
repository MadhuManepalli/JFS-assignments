package springQ5;

import javax.annotation.Resource;



public class Circle implements Shape {
	private Point p ;

	public void draw() {
		System.out.println("Drawing a circle");
		System.out.println("Center is ("+p.getx()+" . "+p.gety()+")");
	}
	
	public Point getP() {
		return p;
	}
	
	@Resource(name="i")
	public void setP(Point p) {
		this.p = p;
	}

}
