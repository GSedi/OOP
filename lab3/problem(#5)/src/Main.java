import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		King king = new King();
		Rook rook = new Rook(); 
		Pawn pawn = new Pawn();
		Queen queen = new Queen();
		Bishop bishop = new Bishop();
		Knight knight = new Knight();
		Position a = new Position(scan.next().charAt(0), scan.nextInt());
		Position b = new Position(scan.next().charAt(0), scan.nextInt());
		
		
		if(knight.isLegalMove(a, b)) System.out.println("true");
		else System.out.println("false");
	}

}
