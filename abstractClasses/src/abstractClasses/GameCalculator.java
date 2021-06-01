package abstractClasses;

public abstract class GameCalculator {
	
	public abstract void calculate();  // no default value-- use override
	
	public final void gameOver() {
		System.out.println("Game over...");
	}
}
