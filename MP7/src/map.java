
public class map extends gameObject {
    private boolean passed = false;
	public map(final int x, final int y) {
    	 super(x,y);
    	 this.intro = "A piece of map is lying on the ground.";
     }
     public void behavior() {
    	 System.out.println(intro);
    	 if (!passed) {
    	 System.out.println("A benevolent CS125 student decided to tell you that the exit is to you left");
    	 changeinhp = 0;
    	 passed = true;
    	 } else {
    		 System.out.println("Rule No.1: no one is trustworthy in this forest. \n(We did tell you the map was 'lying' on the ground.)");
    		 changeinhp = 0;
    	 }
     }
}
