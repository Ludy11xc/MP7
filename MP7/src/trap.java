
public class trap extends gameObject {
    private boolean untriggered = true;
	public trap(final int x, final int y) {
    	super(x,y);
    	this.intro = "Oops, you have fallen into a trap.";
    }
   public void behavior () {
	   if (untriggered) {
	   System.out.println(intro);
	   System.out.println("1:make a rope to climb out off this trap");
	   System.out.println("2:Just climb with your bare hands");
	   String n = myScan.next();
	   while (n.equals("1") == false && n.equals("2") == false) {
		   System.out.println("invalid choice");
		   n = myScan.next();
	   }
	   if (n.equals("1")) {
		   double luck = Math.random();
		   if (luck >= 0.6) {
		   System.out.println("while making rope, you keep bleeding; the wounds are getting ugly; the condition gets worse");
		   changeinhp = -3;
		   untriggered = false;
		   } else {
			   System.out.println("You made it! the damage you take from falling into the trap minimaized");
			   changeinhp = -2;
			   untriggered = false;
		   }
	   }
	   if (n.equals("2")) {
		   double luck1 = Math.random();
		   if (luck1 >= 0.36) {
			   System.out.println("Climbing without rope? No wonder why you lost so many hp");
			   changeinhp = -3;
			   untriggered = false;
		   } else {
			   System.out.println("It is miracle that you made it with bare hands");
			   System.out.println("since you climbed out as soon as possible, the wounds are not severe");
			   changeinhp = -1;
			   untriggered = false;
		   }
		   
	   }
	   } else {
		   System.out.println("there is a empty hole on the ground");
		   changeinhp = 0;
	   }
   }
}
