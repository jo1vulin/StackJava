import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class MyStackTest {
	
	@Test
	public void Push_One_Element_To_Empty_Stack()
	{
		//Arrange
		int stackSize = 1;
		IMyStack<Integer> newStack = new MyStack<Integer>();
		
		//Act
		newStack.Push(1);
		
		//Assert
		assertEquals(stackSize, newStack.getCount());
	}
	

}
