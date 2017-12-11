import java.util.Scanner;
public class Character {
	//private boolean talk;
	//private boolean fight;
	static Scanner myScan = new Scanner(System.in);
	private int x = 2;
    private int y = 1;
    private int hp = 10;
    public boolean alive = true;
    public Character() {
    	 
    }
    
    public void isOver() {
    	System.out.println("Your wounds are too much.  \nYou fall on the ground and breathe your last breath.  \nYou failed.");
    	this.alive = false;
    }
    public void hpchange(final int a) {
    	 
    	hp = hp + a;
    	if (hp > 10) {
    		hp = 10;
    	}
    	if (hp <= 0) {
    		this.isOver(); 
    	}
    	if (hp < 0) {
    		hp = 0;
    	 }
     }
     public void move() {
    	 System.out.println("Please move");
    	 System.out.println("1: move forward");
    	 System.out.println("2: move to the left");
    	 System.out.println("3: move to the right");
    	 System.out.println("4: move backward");
    	 String n = myScan.next();
    	 
    		
    		 while (n.equals("1") == false && n.equals("2") == false && n.equals("3") == false && n.equals("4") == false) {
    			 System.out.println("not a valid move, please move again");
    			 n = myScan.next();
    		 }
    			 if (n.equals("1")) {
    				 
    	    		 this.y = this.y + 1;
    	    		 return;
    				 
    	    	 } else if (n.equals("2")) {
    	    		 
    	    		 this.x = this.x - 1;
    	    		 return;
    	    		 
    	    	 } else if (n.equals("3")) {
    	    		 
    	    		 this.x = this.x + 1;
    	    		 return;
    	    		 
    	    	 } else if (n.equals("4")) {
    	    		 
    	    		 this.y = this.y - 1;
    	    		 return;
    	    		 
    	    	 } 
    		 
    	 }
    	 
       
      public int getX() {
    	  return this.x;
      }
      public int getY() {
    	  return this.y;
      }
      public int getHP() {
    	  return this.hp;
      }
      public void setX(final int XXX) {
    	  this.x = XXX;
      }
      public void setY(final int YYY) {
    	  this.y = YYY;
      }
}

     
     /*public void behavior() {
  	   if (talk == true) {
  	      double luck = Math.random();
  	      if (luck >= 0.65) {
  	    	  System.out.println("You persuaded the monster");
  	    	  return;
  	      } else {
  	    	  System.out.println("Monster believes that what you said is just bullshit and get annoyed");
  	    	  fight = true;
  	      }
  	    if (fight == true) {
  	    	double luck1 = Math.random();
  		      if (luck1 >= 0.5) {
  		    	  this.hpchange(-2);
  		    	  System.out.println("You killed the monster easily");
 		    	  
  		      } else {
  		    	  System.out.println("You killed the monster not so easily");
  		    	  this.hpchange(-4);
  		      }
  	    }
  	   }
  	}
     public void encounter() {
    	 
     }*/
     //using if loop, if it is not the end, call this.behavior at the current grid, call character.move to keep moving

