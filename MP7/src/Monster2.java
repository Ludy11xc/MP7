
public class Monster2 extends gameObject {
    private boolean alive2 = true;  
	public Monster2 (final int x, final int y) {
    	  super(x,y);
    	  this.intro = "This is monster v2.0 which is stronger most other monsters.";
      }
      public void behavior() {
    	  if (this.alive2) {
  		System.out.println(intro);
  		System.out.println("1:talk");
  		System.out.println("2:escape");
  		System.out.println("3:fight");
  		String n = myScan.next();
  		while(n.equals("1") == false && n.equals("2") == false && n.equals("3") == false) {
  			System.out.println("invalid choice");
  			n = myScan.next();
  		}
  		if (n.equals("1")) {
  	  	      double luck = Math.random();
  	  	      if (luck >= 0.67) {
  	  	    	  System.out.println("You persuaded the monster");
  	  	    	  System.out.println("Then, the monster healed you");
  	  	    	  changeinhp = 2;
  	  	    	  return;
  	  	      } else {
  	  	    	  System.out.println("Monster believes that what you said is just bullshit and get annoyed");
  	  	    	  System.out.println("1:escape");
  	  	    	  System.out.println("2:fight");
  	  	    	   n = myScan.next();
  	  	    	  while (n.equals("1") == false && n.equals("2") == false) {
  	  	    		  System.out.println("invalid choice");
  	  	    		  n = myScan.next();
  	  	    	  }
  	  	    	  if (n.equals("1")) {
  	  	    		  double luck2 = Math.random();
  	  	    		  if (luck2 >= 0.80) {
  	  	    			  System.out.println("Good luck, you escaped");
  	  	    			  changeinhp = 0;
  	  	    		  } else {
  	  	    			  System.out.println("failed to escape, after a hard battle, killed the monster");
  	  	    			  changeinhp = -5;
  	  	    			  this.alive2 = false;
  	  	    		  }
  	  	    	  }
  	  	    	if (n.equals("2")) {
  	    			double luck6 = Math.random();
  	    		      if (luck6 >= 0.5) {
  	    		    	  changeinhp = -3;
  	    		    	  System.out.println("You killed the monster easily");
  	    		    	  this.alive2 = false;
  	    		    	  
  	    		      } else {
  	    		    	  System.out.println("You killed the monster not so easily");
  	    		    	  changeinhp = -5;
  	    		    	  this.alive2 = false;
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
      			  changeinhp = -5;
      			  this.alive2 = false;
      		  }
  		}
  		if (n.equals("3")) {
  			double luck1 = Math.random();
  		      if (luck1 >= 0.5) {
  		    	  changeinhp = -3;
  		    	  System.out.println("You killed the monster easily");
  		    	  this.alive2 = false;
  		    	  
  		      } else {
  		    	  System.out.println("You killed the monster not so easily");
  		    	  changeinhp = -5;
  		    	  this.alive2 =  false;
  		      }
  		}
    	  } else {
    		  System.out.println("the body of the monster is laying on the ground");
    		  changeinhp = 0;
    	  }
  		
}
}