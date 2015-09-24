package kr.ac.kookmin.shape;

public class Ellipse extends Shape {
	//Implement here
	
	private int w;
	private int h;
	
    public Rectangle getBounds(){
	return new Rectangle(center, w*2, h*2);
}

@Override
public void draw(Graphics g) {
	g.draw(this);
}
@Override
public String toString() {
	return "Ellipse";
}

}
