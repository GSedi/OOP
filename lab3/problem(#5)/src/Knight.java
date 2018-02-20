
public class Knight extends Piece {
	public Knight() {}
	@Override
	public boolean isLegalMove(Position a, Position b) {
		if(b.getY() <= 8 &&  a.getY() <= 8 && b.getY() >=1 && a.getY() >= 1 && a.getX() >=65 && b.getX() >= 65 && a.getX() <= 72 && b.getX() <=72) {
				if(Math.abs(b.getX() - a.getX()) == 2 && Math.abs(b.getY() - a.getY()) == 1)  return true;
				else if (Math.abs(b.getX() - a.getX()) == 1 && Math.abs(b.getY() - a.getY()) == 2)  return true;
				else return false;
		}
		else return false;
	}

}
