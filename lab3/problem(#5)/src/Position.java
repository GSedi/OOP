
public class Position {
	private char x;
	private int y;
	
	public Position() {}
	
	public Position(char x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(char x) {this.x = x;}
	public void setY(int y) {this.y = y;}
	
	public char getX() {return x;}
	public int getY() {return y;}
}
