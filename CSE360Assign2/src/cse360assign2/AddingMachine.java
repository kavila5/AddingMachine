package cse360assign2;


/**
 * @author Kristian Avila 
 * @version 1.0
 * <p>
 * Class ID: 70641
 * <p>
 * Individual Assignment 2
 * <p>
 * This class is called AddingMachine and will have the basic functions of a
 * calculator, it will be able to add and subtract. It will also be able to 
 * display the history of calculations that are being computed and displayed
 * to the user.
 */

public class AddingMachine
{
	private int total;
	
	/** Creates an constructor method for the class AddingMachine and will
	 * initialize the global variable total to 0. 
	*/
	public AddingMachine()
	{
		total = 0;  // not needed - included for clarity
	}
	
	/** Gets the total for the calculation being performed.
	 * @return A integer representing the total of the calculation being
	 * performed.
	*/
	public int getTotal()
	{
		return 0;
	}
	
	/** the add method will take a integer variable called value that will
	 * be added to the global variable total.
	 * @param value
	*/
	public void add(int value)
	{
		
	}
	
	/** the subtract method will take a integer variable called value that
	 * will be subtracted from the global variable total.
	 * @param value
	*/
	public void subtract(int value)
	{
		
	}
	
	/** the toString method will turn the global variable total and convert it
	 * to a string so the calculation is able to be printed to the user in a
	 * way that is easy to read.
	 * @return A string representing the total of the calculation being
	 * performed
	*/
	public String toString()
	{
		return "";
	}
	
	/** The clear method has no parameters and no return value. This method
	 * will reset the global variable total back to 0.
	*/
	public void clear()
	{
		
	}
}
