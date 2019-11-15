package hw03;

public class RightArrow extends ShapeBase {
	private int tail;
	private int width;
	
	public void drawHere() {
		int arrowhead = 0;
		for(int i = 0; i < width/2; i++) {
			space(getOffset());
			System.out.print("*");
			if(arrowhead != 0) {
				space(arrowhead);
				System.out.println("*");
				arrowhead++;
			}
			else {
				System.out.println("");
			}
			arrowhead++;
		}
		for(int i = 0; i < tail; ++i) {
			System.out.print("*");
		}
		space(arrowhead);
		arrowhead -=2;
		System.out.println("*");
		for(int i = 0; i < width/2; i++) {
			space(getOffset());
			System.out.print("*");
			if(arrowhead != -1) {
				space(arrowhead);
				System.out.println("*");
				arrowhead--;
			}
			else {
				System.out.println("");
			}
			arrowhead--;
		}
	}
	public RightArrow() {
		tail = 5;
		width = 3;
		setOffset(tail-1);
	}
	public RightArrow(int theTail, int theWidth) {
		if(theWidth>= 3 && theWidth%2 == 1) {
			tail = theTail;
			width = theWidth;
			setOffset(theTail-1);
		}
	}
	public void setWidth(int theWidth) {
		if(theWidth>= 3 && theWidth%2 == 1)
			width = theWidth;
	}
	public void setTail(int theTail) {
		tail = theTail;
		setOffset(tail-1);
	}
	
	private void space(int step) {
		for(int i = 0; i < step; i++)
			System.out.print(" ");
	}
	
	public static void main(String[] args) {
		RightArrow arrow1 = new RightArrow();
		arrow1.drawHere();
		arrow1.setTail(16);
		arrow1.setWidth(7);
		arrow1.drawAt(3);
	}
}
