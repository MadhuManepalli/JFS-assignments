package springQ5;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Required;

public class Dot implements Shape{
	private Point center ;
	@Inject
	private injectimpl injectImpl;
	public Point getcenter() {
		return center;
	}
	@Required
	public void setcenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Dot is at : ("+center.getx()+" . "+center.gety()+")");
		System.out.println(injectImpl);
	}


}
