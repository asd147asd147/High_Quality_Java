package hw03;

public class RightArrow extends ShapeBase implements ShapeInterface {
	private int tail;
	private int width;
	private int base;
	
	public void drawHere() {
		int arrowhead = 0;
		for(int i = 0; i < width/2; i++) {
			space(base + getOffset());
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
		space(getOffset());
		for(int i = 0; i < tail; ++i) {
			System.out.print("*");
		}
		space(arrowhead);
		arrowhead -=2;
		System.out.println("*");
		for(int i = 0; i < width/2; i++) {
			space(base + getOffset());
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

	public RightArrow(int theTail, int theWidth, int offset) {
		if(theWidth>= 3 && theWidth%2 == 1) {
			tail = theTail;
			width = theWidth;
			base = theTail-1;
			setOffset(offset);
		}
		else {
			tail = theTail;
			width = theWidth+1;
			base = theTail-1;
			setOffset(offset);
			System.out.println("Width is "+theWidth+" -> " + width);
		}
	}

	private void space(int step) {
		for(int i = 0; i < step; i++)
			System.out.print(" ");
	}
	
	public static void main(String[] args) {
		ShapeInterface arrow1 = new RightArrow(5,4,0);
		arrow1.drawHere();
		ShapeInterface arrow2 = new RightArrow(16,7,5);
		arrow2.drawAt(2);
		ShapeInterface arrow3 = new RightArrow(10,9,2);
		arrow3.drawAt(3);
	}
}
