
public interface IMyStack<T> {
	
	/**
	 * Returns the number of elements in the Stack<T>
	 * 
	 * @return Count
	 */
	int getCount();
	
	/**
	 * Ads the element to the Stack<T>
	 * 
	 * @param elementValue
	 * 			value of the element that is being added to the Stack<T>
	 */
	void Push(T elementToPushToStack);
	
	/**
	 * Returns the top element from the Stack<T> and sets the previous element to
	 * top position
	 * 
	 * @return removedElement
	 * 			top element from the Stack<T>
	 */
	MyStack<T>.Elements Pop();
	
	/**
	 * Returns the top element from the Stack<T>. Stack remains unchanged
	 * 
	 * @return topElement
	 * 			Top element from the Stack<T>
	 */
	MyStack<T>.Elements Peek();
	
	/**
	 * Should be removed
	 */
	void writeAllElements();
	
	

}
