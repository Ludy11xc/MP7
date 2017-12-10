
public class exit extends gameObject{
     public exit(final int x, final int y) {
    	 super(x,y);
    	 this.intro = "You have reached the exit.";
     }
     public void behavior () { 
    	 System.out.println(intro);
    	 changeinhp = 0;
     }
}
