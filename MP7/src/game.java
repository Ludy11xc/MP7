
public class game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adventure game = new Adventure();
		Character challen = new Character();
		int originX;
		int originY;
		while(challen.getHP() > 0 && (challen.getX() != 3 || challen.getY() != 4)) {
			game.adventure[challen.getX()][challen.getY()].behavior();
			challen.hpchange(game.adventure[challen.getX()][challen.getY()].changeinhp);
			System.out.println("Current hp: " + challen.getHP());
			originX = challen.getX();
			originY = challen.getY();
			if (challen.getHP() <= 0) {
				break;
			}
			System.out.println();
			challen.move();
			if (game.adventure[challen.getX()][challen.getY()].getClass() == blocked.class) {
				game.adventure[challen.getX()][challen.getY()].behavior();
				challen.hpchange(game.adventure[challen.getX()][challen.getY()].changeinhp);
				System.out.println("Current hp: " + challen.getHP());
				challen.setX(originX);
				challen.setY(originY);
				
			}
			if (game.adventure[challen.getX()][challen.getY()].getClass() == teleport.class) {
				game.adventure[challen.getX()][challen.getY()].behavior();
				challen.hpchange(game.adventure[challen.getX()][challen.getY()].changeinhp);
				System.out.println("Current hp: " + challen.getHP());
				challen.setX(1);
				challen.setY(4);
				
			}
			//System.out.println("Current position: " + challen.getX() + "," + challen.getY());
		}
		if (challen.getHP() <= 0) {
			System.out.println("You have been killed.  Gameover.");
		} else {
			System.out.println("You escaped the forest.");
		}
		

	}

}
