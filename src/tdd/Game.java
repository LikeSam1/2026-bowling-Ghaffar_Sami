package tdd;

public class Game {

	private int[] roll = new int[21];
	private int nbRoll = 0;
	
	public void roll(int nbQuilles) {
		roll[nbRoll++] = nbQuilles;
	}
	
	public boolean spare(int i) {
		return roll[i] + roll[i + 1] == 10;
	}
	
	public boolean strike(int i) {
		return roll[i] == 10;
	}
	
	public int score() {
		int totalScore = 0;
        int i = 0;
		
		for (int frame = 0; frame < 10; frame++) {
			if (strike(i)) {
                totalScore += 10 + roll[i + 1] + roll[i + 2];
                i++;
            } else if (spare(i)) {
                totalScore += 10 + roll[i + 2];
                i += 2;
            } else {
                totalScore += roll[i] + roll[i + 1];
                i += 2;
            }
		}
		return totalScore;
	}
}
