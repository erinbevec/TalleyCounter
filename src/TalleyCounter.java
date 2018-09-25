/**
 * 
 * Erin Bevec
 * AP Computer Science - Mr. Ellis
 * TalleyCounter
 */
public class TalleyCounter 
{
//fields
		private int count;
		
		
//constructors
		
		public TalleyCounter() 
		{
			count = 0;
		}
		
		public int setCounter(int a) 
		{
			count = a;
		}
		public int getCount()
		{
			return count;
		}
		
		
		public void reset()
		{
			count = 0;
		}
		
		
		public void unclick()
		{
			count--; 
		}
		
		
		public void click()
		{ 
			count = count + 1;
			
			//count++; //count = count +1
			
			//count = += 1; //count = count + 1
			
	
			
		}
		

		}
}
