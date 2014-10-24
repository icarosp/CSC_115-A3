public class Node<T>{
	private T info;
	private Node<T> next;

	public Node(){
		this.info = null;
		this.next = null;
	}

	public Node(T info){
		this.info = info;
		this.next = null;
	}

	public Node(T info, Node<T> next){
		this.info = info;
		this.next = next;
	}

	public void setNext(Node<T> next){
		this.next = next;
	}

	public Node<T> getNext(){
		return this.next;
	}

	public T getInfo(){
		return this.info;
	}
}