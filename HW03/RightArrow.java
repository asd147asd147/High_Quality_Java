package hw3;

public class RightArrow extends ShapeBase {
	private int tail;
	private int width;
	
	public void drawHere() {
		for(int i = 0; i < tail-1; ++i)
			System.out.print("*");
	}
	public void RightArrow() {
		tail = 0;
		width = 0;
	}
	public void setWidth(int theWidth) {
		width = theWidth;
	}
	public void setTail(int theTail) {
		tail = theTail;
	}
	
	public static void main(String[] args) {
		RightArrow R = new RightArrow();
		R.setTail(16);
		R.drawAt(3);
	}
}
