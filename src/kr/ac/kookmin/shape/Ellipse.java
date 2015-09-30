package kr.ac.kookmin.shape;

public class Ellipse extends Shape {
	
	private int w;
	private int h;
	
	
	public Ellipse(Point center, int w, int h){
		this.center=center;
		this.w=w;
		this.h=h;
	}
	
    public Rectangle getBounds(){
    	return new Rectangle(center ,w*2, h*2);
    }
    
    public int getSemiMajorAxis(){
    	
    	int max=0;
    	
    	if(w>h)
    		max=w*2;
    	else
    		max=h*2;
    	
    	return max;
    }
    
    public int getSemiMinorAxis(){
    	
    	int min=0;
    	
    	if(w>h)
    		min=h*2;
    	else
    		min=w*2;
    	
    	return min;
    }

    //Override
    public void draw(Graphics g) {
    	g.draw(this);
    }
    
    //Override
    public String toString() {
    	return "Ellipse";
    }

}
