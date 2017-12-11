
public class teleport extends gameObject {
   public teleport(final int x, final int y) {
	   super(x,y);
	   this.intro = "Roses are red, violets are purple"
	   		+ "\n"
	   		+ "curiosity kills the cat, you are being teleported";
   }
   public void behavior() {
	   System.out.println(intro);
	   //int tx = 1;
	   //int ty = 4;
	   
	   changeinhp = 0;
   }
}
