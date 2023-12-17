public class Circle {
final static double PI=3.141519;
private int radius;
Circle(int radius){
	setRadius(radius);
}
public int getRadius(){
	return radius;
}
public void setRadius(int radius) {
	this.radius=radius;
}
public double computeArea() {
	return PI*Math.pow(radius, 2);
}
}
