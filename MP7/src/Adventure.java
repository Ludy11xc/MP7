
public class Adventure {
	gameObject[][] adventure;
  public Adventure() {
	
	 adventure = new gameObject[6][6];

 
	for (int i = 0; i < 6; i++) {
		for (int n = 0; n < 6; n++) {
			if (i == 0 || n == 0 || i == 5 || n == 5) {
				adventure[i][n] = new blocked(i,n);
			}
			
		}
	}
	adventure[1][1] = new blocked(1,1);
	adventure[1][3] = new blocked(1,3);
	adventure[3][1] = new blocked(3,1);
	adventure[4][1] = new blocked(4,1);
	adventure[3][3] = new blocked(3,3);
	adventure[2][1] = new birthplace(2,1);
	adventure[3][4] = new exit(3,4);
	adventure[2][2] = new Monster1(2,2);
	adventure[2][3] = new Monster1(2,3);
	adventure[4][2] = new Monster2(4,2);
	adventure[2][4] = new Monster2(2,4);
	adventure[1][4] = new trap(1,4);
	adventure[4][4] = new trap(4,4);
	adventure[3][2] = new healer(3,2);
	adventure[1][2] = new map(1,2);
	adventure[4][3] = new teleport(4,3);
	
	
  }
}

