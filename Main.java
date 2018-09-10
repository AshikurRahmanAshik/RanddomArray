package homework;
public class Main {
	public static void main(String[] args) {
		final int LENGTH = 20;
		int[] rand = new int[LENGTH];
		for(int i = 0;i < LENGTH; i++) {
			int random = (int )(Math.random() * 20 + 1);
			rand[i] = random;
		}
		System.out.println("Displaying Run");
		displayRun(rand);	
	}
	static void displayRun(int[] randNum) {
		for(int i = 0; i < randNum.length - 1; i++) {
			if(randNum[i] != randNum[i+1]) {
				System.out.print(randNum[i] + " ");
			}
			else {
				System.out.print("( " + randNum[i] + " ");
				int samevalue = randNum[i];
				while(randNum[i] == samevalue) {
					System.out.print(randNum[i] + " ");
					i++;
				}
				System.out.print(") ");
			}
		}
	}
}