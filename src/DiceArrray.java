
public class DiceArrray {

	public static void main(String[] args) {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int[] count = new int[13];
		
		for (int i = 0; i<1000;i++)
		{
			int diceSum = dice1.Roll() + dice2.Roll();
			count[diceSum]++;
		}
		for (int i = 2; i<13; i++)
		{
			System.out.println("Rolls of " + i + " : " + count[i]);
		}
	}

}
