
public class Pawn extends Piece {
	public Pawn() {}
	@Override
	public boolean isLegalMove(Position a, Position b) {
		if(b.getY() - a.getY() ==1 && b.getX() == a.getX() && b.getY() <= 8 && 
				 a.getY() <= 8 && b.getY() >=1 && a.getY() >= 1 && a.getX() >=65 && b.getX() >= 65 && a.getX() <= 72 && b.getX() <=72) return true;
		else return false;
	}

}
