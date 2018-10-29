
public class Dice 
{
	//fields
		private int numRoll; 
		
		//constructors
		/**
		 * constructing a Dice object
		 */
			public Dice()
			{
				numRoll = 0;		
			}
			
		//methods
		/**
		 * Reseting the dice number of rolls to 0
		 */
		public void reset()
		{
				numRoll = 0;
		}
		
		/**
		 * getting roll number
		 * @return numRoll
		 */
		public int numRoll()
			{
				return numRoll;
			}
		/**
		 * rolling the Dice
		 * @return integer value dice returns (1-6)
		 */
		public int Roll()
			{
				numRoll++;
				return (int)(Math.random()*6) + 1;
			
			}
}
