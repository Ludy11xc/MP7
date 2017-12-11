
public class Monster1 extends gameObject {
   private boolean alive1 = true;
	public Monster1 (final int x, final int y) {
   super(x,y);
   this.intro = "A monster which looks not so friendly appeared in front you.";
   }
	
	public void behavior() {
		if (this.alive1) {
		System.out.println(intro);
		System.out.println("1: talk");
		System.out.println("2: escape");
		System.out.println("3: fight");
		String n = myScan.next();
		while(n.equals("1") == false && n.equals("2") == false && n.equals("3") == false) {
			System.out.println("Invalid choice.  Try again.");
			n = myScan.next();
		}
		if (n.equals("1")) {
	  	      double luck = Math.random();
	  	      if (luck >= 0.75) {
	  	    	  System.out.println("You persuaded the monster.");
	  	    	  System.out.println("Then, the monster healed you.");
	  	    	  changeinhp = 1;
	  	    	  return;
	  	      } else {
	  	    	  System.out.println("The monster believes that what you said is just garbage and gets annoyed.");
	  	    	  System.out.println("1: escape");
	  	    	  System.out.println("2: fight");
	  	    	   n = myScan.next();
	  	    	  while (n.equals("1") == false && n.equals("2") == false) {
	  	    		  System.out.println("Invalid choice.  Try again.");
	  	    		  n = myScan.next();
	  	    	  }
	  	    	  if (n.equals("1")) {
	  	    		  double luck2 = Math.random();
	  	    		  if (luck2 >= 0.75) {
	  	    			  System.out.println("Good luck, you escaped");
	  	    			  changeinhp = 0;
	  	    			  return;
	  	    		  } else {
	  	    			  System.out.println("You failed to escape, but after a hard battle, you killed the monster.");
	  	    			  changeinhp = -4;
	  	    			  this.alive1 = false;
	  	    			  return;
	  	    		  }
	  	    	  }
	  	    	  if (n.equals("2")) {
	  	    	
	  	  			double luckf = Math.random();
	  	  		      if (luckf >= 0.5) {
	  	  		    	  changeinhp = -2;
	  	  		    	  System.out.println("You killed the monster easily");
	  	  		    	  this.alive1 = false;
	  	  		    	  return;
	  	  		    	  
	  	  		      } else {
	  	  		    	  System.out.println("You killed the monster not so easily");
	  	  		    	  changeinhp = -4;
	  	  		    	  this.alive1 = false;
	  	  		    	  return;
	  	  		      }
	  	  		
	  	    	  }
	  	    	  /*double luck1 = Math.random();
	  		      if (luck1 >= 0.5) {
	  		    	  changeinhp = -2;
	  		    	  System.out.println("You killed the monster easily");
	 		    	  
	  		      } else {
	  		    	  System.out.println("You killed the monster not so easily");
	  		    	  changeinhp = -4;
	  		      }*/
	  	    }
	  	   }
		if (n.equals("2")) {
			double luck3 = Math.random();
    		  if (luck3 >= 0.75) {
    			  System.out.println("Good luck, you escaped");
    			  changeinhp = 0;
    		  } else {
    			  System.out.println("failed to escape, after a hard battle, killed the monster");
    			  changeinhp = -4;
    			  this.alive1 = false;
    		  }
		}
		if (n.equals("3")) {
			double luck1 = Math.random();
		      if (luck1 >= 0.5) {
		    	  changeinhp = -2;
		    	  System.out.println("You killed the monster easily");
		    	  this.alive1 = false;
		    	  
		    	  
		      } else {
		    	  System.out.println("You killed the monster not so easily");
		    	  changeinhp = -4;
		    	  this.alive1 = false;
		      }
		}
		
	}
	 else {
		System.out.println("the body of the monster is lying on the ground");
		changeinhp = 0;
	}
	}
	
}
