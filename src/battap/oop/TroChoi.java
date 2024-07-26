package battap.oop;

public class TroChoi {
	String gameName;
	int score;
	int turnsLeft;
	boolean isPlaying;

	public TroChoi() {
	}

	public void startGame() {
		if (this.isPlaying) {
			return;
		} else {
			this.isPlaying = true;
			this.score = 0;
			this.turnsLeft = 3;
			System.out.println("----- WELCOME TO THE GAME ----");
			System.out.println("Let's go!");
		}
	}

	public void endGame() {
		if (!this.isPlaying) {
			return;
		} else {
			this.isPlaying = false;
			System.out.println("...");
			System.out.println("Game over!");
			System.out.println("Score: " + this.score);
		}
	}

}
