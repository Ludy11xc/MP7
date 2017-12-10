
public class birthplace extends gameObject {
   private boolean unpassed = true;
	public birthplace(final int x, final int y) {
        super(x, y);
        this.intro = "Welcome dear player(I know you are Pro.Challen, though), "
        		+"\n" + "this is your birthplace, "
        		+"\n" + "you have 10 hp"
        		+"\n" + "you lost in the magical forest, try to get out";
	}
	public void behavior() {
		if (unpassed) {
		System.out.println(this.intro);
		changeinhp = 0;
		unpassed = false;
		} else {
			System.out.println("A place where you feel so familiar.");
			changeinhp = 0;
		}
	}

	
     
}
