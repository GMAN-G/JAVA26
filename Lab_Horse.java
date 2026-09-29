package ch03;

public class Lab_Horse {

	public static void main(String[] args) throws InterruptedException{
		int[] horse = {0, 1, 2, 3, 4, 5, 6};
		int win = -1;
		boolean go = true;
		
		while (go) {
			for (int i = 0; i < 7; i++) System.out.println();
			for (int k = 0; k < horse.length; k++) {
				horse[k] = horse[k] + (int) (Math.random() * 10);
				for (int m = 0; m < horse[k]; m++) System.out.print(" ");
				
				System.out.println(k + ":>");
				if (horse[k] > 100) {
					win = k;
					go = false;
				}
			}
			Thread.sleep(1000);
		}
		System.out.println("< " + win + "번 말 승리 >");
	}
}
