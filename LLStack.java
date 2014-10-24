public class LLStack<T> implements Stack<T>{

	private Node<T> top;
	private int count;

	public LLStack(){
		this.top = null;
		this.count = 0;
	}

	public int size(){
		return count;
	}

	public boolean empty(){
		if(this.count == 0)
			return true;
		else
			return false;
	}

	public void push (T element){
		Node<T> n = new Node<T>(element);
		if(count == 0){
			top = n;
		}
		else{
			n.setNext(top);
			top = n;
		}
		this.count++;
	}

	public T pop() throws StackEmptyException{
		if(empty()){
			throw new StackEmptyException("");
		}
		T temp = peek();
		top = top.getNext();
		count--;
		return temp;
	}

	public T peek() throws StackEmptyException{
		if(empty()){
			throw new StackEmptyException("");
		}
		return top.getInfo();
	}

	public void makeEmpty(){
		top = null;
	}
}