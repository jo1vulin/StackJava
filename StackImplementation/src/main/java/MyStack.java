
public class MyStack<T> implements IMyStack<T> {
	
	public class Elements {
		
		public T elementValue;
		public Elements previousElement;
	}
	
	private int Count;
	private Elements topElement;
	
	
	/**
	 * Returns the number of elements in the Stack<T>
	 * 
	 * @return Count
	 */
	public int getCount(){
		return Count;
	}
	
	private void setCount(int value){
		this.Count += value;
	}
	
	/** Constant used for exception message*/ 
	private static final String LIST_EMPTY_ERROR_MESSAGE = "List is empty!";
	
	/**
	 * Ads the element to the Stack<T>
	 * 
	 * @param elementValue
	 * 			value of the element that is being added to the Stack<T>
	 */
	public void Push(T elementValue){
		setCount(1);
		if (topElement == null)
		{
			topElement = createElement(elementValue, null);
		}
		else
		{
			topElement = createElement(elementValue, topElement);
		}
	}
	
	/**
	 * Returns the top element from the Stack<T> and sets the previous element to
	 * top position
	 * 
	 * @return removedElement
	 * 			top element from the Stack<T>
	 */
	public Elements Pop(){
		verifyIfListIsEmpty();
		Count--;
		Elements removedElement = topElement;
		Elements previousElement = topElement.previousElement;
		topElement = previousElement;
		return removedElement;
		
	}
	
	/**
	 * Returns the top element from the Stack<T>. Stack remains unchanged
	 * 
	 * @return topElement
	 * 			Top element from the Stack<T>
	 */
	public Elements Peek(){
		verifyIfListIsEmpty();
		return topElement;
	}
	
	public void writeAllElements(){
		Elements tempElement  = topElement;
		
		while(tempElement != null)
		{
			System.out.println(tempElement.elementValue);
			tempElement = tempElement.previousElement;
		}
	}
	
	private void verifyIfListIsEmpty(){
		if (topElement == null)
		{
			throw new IllegalStateException(LIST_EMPTY_ERROR_MESSAGE);
		}
	}
	
	
	/**
	 * Create new object of Element 
	 * 
	 * @param elementValue 
	 * 			value of the element (type T) being added Stack<T>
	 * @param previousElement 
	 * 			previous element(type Elements) in the Stack<T> 
	 * 
	 * @return Elements newElement
	 */
	private Elements createElement(T elementValue,Elements previousElement)
	{
		Elements newElement = new Elements();
		newElement.previousElement = previousElement;
		newElement.elementValue = elementValue;
		return newElement;
	}
	

}

