package hw03;

public class LeftArrow extends ShapeBase {
	private int tail;
	private int width;
	
	public void drawHere() {
		int arrowhead = getOffset();
		int headjump = 1;
		for(int i = 0; i < width/2; i++) {
			space(arrowhead);
			System.out.print("*");
			if(arrowhead != getOffset()) {
				space(headjump);
				System.out.println("*");
				headjump += 2;
			}
			else {
				System.out.println("");
			}
			arrowhead-=2;
		}
		System.out.print("*");
		space(headjump);
		for(int i = 0; i < tail; i++) {
			System.out.print("*");
		}
		arrowhead+=2;
		System.out.println("");
		for(int i = 0; i < width/2; i++) {
			space(arrowhead);
			System.out.print("*");
			if(arrowhead != getOffset()) {
				headjump -= 2;
				space(headjump);
				System.out.println("*");				
			}
			else {
				System.out.println("");
			}
			arrowhead+=2;
		}
	}
	public LeftArrow() {
		tail = 5;
		width = 3;
		setOffset(width-1);
	}
	public LeftArrow(int theTail, int theWidth) {
		if(theWidth>= 3 && theWidth%2 == 1) {
			tail = theTail;
			width = theWidth;
			setOffset(theWidth-1);
		}
	}
	public void setWidth(int theWidth) {
		if(theWidth>= 3 && theWidth%2 == 1) {
			width = theWidth;
			setOffset(theWidth-1);
		}
	}
	public void setTail(int theTail) {
		tail = theTail;
	}
	
	private void space(int step) {
		for(int i = 0; i < step; i++)
			System.out.print(" ");
	}
	
	public static void main(String[] args) {
		LeftArrow arrow1 = new LeftArrow();
		arrow1.drawHere();
		arrow1.setTail(16);
		arrow1.setWidth(7);
		arrow1.drawAt(3);
	}
}
