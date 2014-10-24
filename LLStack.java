public class LLStack<T> implements Stack<T>{

	private Node<T> top;
	private int count;

	public LLStack(){
		this.top = null;
		this.counter = 0;
	}

	public int size(){
		return count;
	}

	public boolean empty(){
		if(counter == 0)
			return true;
		else
			return false;
	}
	public void push (T element){
	}

	public T pop() throws StackEmptyException{
		throw new StackEmptyException("Stack empty");
	}

	public T peek() throws StackEmptyException{
		throw new StackEmptyException("Stack empty");
	}

	public void makeEmpty(){
	}
}