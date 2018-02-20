
public class Rook extends Piece {
	public Rook() {}
	
	
	@Override
	public boolean isLegalMove(Position b) {
		
		return isLegalMove(a,b);
				
	}
	public static boolean isLegalMove(Position a, Position b) {
		if(b.getY() > a.getY() && a.getX() == b.getX() && b.getY() <=8) return true;
		else if(b.getY() < a.getY() && a.getX() == b.getX() && b.getY() >=1) return true;
		else if(b.getX() > a.getX() && a.getY() == b.getY() && b.getX() <=72) return true;
		else if(b.getX() < a.getX() && a.getY() == b.getY() && b.getX() >= 65) return true;
		else return false;
				
	}

}
