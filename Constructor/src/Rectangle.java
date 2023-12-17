public class Rectangle {
	private int x, y;
	private int width, height;
public Rectangle() {
	this(0,0,1,1);
}
public Rectangle(int width, int height) {
	this(0, 0, width, height);
}
public Rectangle(int x, int y, int width, int height) {
	this.x=x;
	this.y=y;
	this.width=width;
	this.height=height;
	}
public int getX(){
	return x;
}
public int getY(){
	return y;
}
public int getWidth(){
	return width;
}
public int getHeight(){
	return height;
}
public void setRectangle(int x,int y,int width,int height){
	this.x=x;
	this.y=y;
	this.width=width;
	this.height=height;
}
public String toString() {
	return getX()+","+getY()+","+ getWidth()+"," + getHeight();
}
}
