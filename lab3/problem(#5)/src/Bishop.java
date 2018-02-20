import java.util.*;
public class Bishop extends Piece {
	public Bishop() {}
	@Override
	public boolean isLegalMove(Position a, Position b) {
		if(Math.abs(a.getX() - b.getX()) == Math.abs(a.getY() - b.getY()) && b.getY() <= 8 && 
				 a.getY() <= 8 && b.getY() >=1 && a.getY() >= 1 && a.getX() >=65 && b.getX() >= 65 && a.getX() <= 72 && b.getX() <=72) return true;
		else return false;
	}

}
