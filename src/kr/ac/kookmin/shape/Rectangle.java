package kr.ac.kookmin.shape;

public class Rectangle extends Shape {
	//Implement here
	
	private int h;
	private int w;
	
		public Rectangle getBounds() {
			return this;
		}
		@Override
		public void draw(Graphics g) {
			g.draw(this);
		}
		@Override
		public String toString() {
			return "Rectangle";
		}

}
