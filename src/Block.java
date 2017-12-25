
public class Block {

	private int width;
	private int length;
	private int height;
	
	public Block(int[] wlh) {
		
		width = wlh[0];
		length = wlh[1];
		height = wlh[2];
		
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getLength() {
		return length;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getVolume() {
		return width * length * height;
	}
	
	public int getSurfaceArea() {
		return (2 * (width * length)) + (2 * (length * height)) + (2 * (width * height));
	}
}
