package FirstHand_Sep_25;

public class count {

	public static void main(String args[]) {
	
		int num = 118937348;
		int count = 0;
		
		if (num==0) {
			System.out.println(1);
		}else {
			for(int j = num; j > 0; j = j/10) {
				count ++;
			}
			System.out.println(count);
		}
		
	}
}
