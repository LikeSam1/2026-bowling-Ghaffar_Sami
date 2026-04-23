package tdd;

public class Game {

	private int score = 0;
	private int[] roll = new int[50];
	private int nbRoll = 0;
	
	public void roll(int nbQuilles) {
		roll[nbRoll++] = nbQuilles;
	}
	
	public boolean spare(int i) {
		if (i>1 && roll[i-1] + roll[i-2] == 10) {
			return true;
		}
		return false;
	}
	
	public int score() {
		for (int i = 0; i < roll.length; i++) {
			if (i%2 == 0 && spare(i)) {
				score += roll[i] * 2;
			} else {
				score += roll[i];
			}
		}
		return score;
	}
}
