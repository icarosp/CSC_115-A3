public class Node<T>{
	private T info;
	private T next;

	public Node(){
		this.info = null;
		this.next = null;
	}

	public Node(T info){
		this.info = info;
		this.next = null;
	}

	public Node(T info, T next){
		this.info = info;
		this.next = next;
	}

}