package hw03;

public class LeftArrow extends ShapeBase implements ShapeInterface{
	private int tail;
	private int width;
	private int base;
	
	public void drawHere() {
		int arrowhead = base+getOffset();
		int headjump = 1;
		for(int i = 0; i < width/2; i++) {
			space(arrowhead);
			System.out.print("*");
			if(arrowhead != base + getOffset()) {
				space(headjump);
				System.out.println("*");
				headjump += 2;
			}
			else {
				System.out.println("");
			}
			arrowhead-=2;
		}
		space(getOffset());
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
			if(arrowhead != base + getOffset()) {
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

	public LeftArrow(int theTail, int theWidth, int offset) {
		if(theWidth>= 3 && theWidth%2 == 1) {
			tail = theTail;
			width = theWidth;
			base = theWidth-1;
			setOffset(offset);
		}
		else {
			tail = theTail;
			width = theWidth+1;
			base = width-1;
			setOffset(offset);
			System.out.println("Width is "+theWidth+" -> " + width);
		}
	}

	private void space(int step) {
		for(int i = 0; i < step; i++)
			System.out.print(" ");
	}
	
	public static void main(String[] args) {
		ShapeInterface arrow1 = new LeftArrow(5,4,0);
		arrow1.drawHere();
		ShapeInterface arrow2 = new LeftArrow(16,7,5);
		arrow2.drawAt(2);
		ShapeInterface arrow3 = new LeftArrow(10,9,2);
		arrow3.drawAt(3);
	}
}
