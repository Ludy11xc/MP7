
public class blocked extends gameObject {
   public blocked(final int x, final int y) {
	   super(x,y);
	   this.intro = "The path is blocked.  " + "\n" + "You foolishly hurt yourself trying to get through.";
	   
   }
   public void behavior() {
	   System.out.println(intro);
	   System.out.println("Since you are a little bit too curious, I have to tell you, curiosity kills the cat.");
	   changeinhp = -1;
   }
}
