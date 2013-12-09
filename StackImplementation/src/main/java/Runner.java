

public class Runner {
	
	public static void main(String[] args)
	{
		
		IMyStack<Integer> stack = new MyStack<Integer>();
		
		stack.Push(1);
		stack.Push(2);
		stack.Push(3);
		stack.Push(4);
		stack.Push(5);
		
		stack.writeAllElements();
		
		System.out.println(stack.getCount());
		
		
	}

}
