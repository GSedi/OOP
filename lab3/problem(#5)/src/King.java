
public class King extends Piece {
	public King() {}
	@Override
	public boolean isLegalMove(Position a, Position b) {
		if(b.getY() > a.getY() && b.getY() <= 8) {
			if(b.getX() > a.getX() && b.getX() <= 72) {
				if(b.getY() - a.getY()  == 1 && b.getX() - a.getX() == 1) return true;
				else return false;
			}
			
			else if (b.getX() < a.getX() && b.getX() >= 65){
				if(b.getY() - a.getY()  == 1 && b.getX() - a.getX() == -1) return true;
				else return false;
			}
			else if (b.getX() == a.getX() && b.getX() >= 65 && b.getX() <= 72){
				if(b.getY() - a.getY()  == 1 && b.getX() - a.getX() == 0) return true;
				else return false;
			}
			else return false;
		}
		else if(b.getY() < a.getY() && b.getY() >= 1) {
			if(b.getX() > a.getX() && b.getX() <= 72) {
				if(b.getY() - a.getY()  == -1 && b.getX() - a.getX() == 1) return true;
				else return false;
			}
			
			else if (b.getX() < a.getX() && b.getX() >= 65){
				if(b.getY() - a.getY()  == -1 && b.getX() - a.getX() == -1) return true;
				else return false;
			}
			else if (b.getX() == a.getX() && b.getX() >= 65 && b.getX() <= 72){
				if(b.getY() - a.getY()  == -1 && b.getX() - a.getX() == 0) return true;
				else return false;
			}
			else return false;
		}
		
		else  if(b.getY() == a.getY() && b.getY() >= 1 && b.getY() <= 8) {
			if(b.getX() > a.getX() && b.getX() <= 72) {
				if(b.getY() - a.getY()  == 0 && b.getX() - a.getX() == 1) return true;
				else return false;
			}
			
			else if (b.getX() < a.getX() && b.getX() >= 65){
				if(b.getY() - a.getY()  == 0 && b.getX() - a.getX() == -1) return true;
				else return false;
			}
			else if (b.getX() == a.getX() && b.getX() >= 65 && b.getX() <= 72){
				if(b.getY() - a.getY()  == 0 && b.getX() - a.getX() == 0) return true;
				else return false;
			}
			else return false;
		}
		
		else { 
			return false;
		}
				
	}

}
