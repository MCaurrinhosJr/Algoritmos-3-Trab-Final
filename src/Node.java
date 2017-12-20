
public class Node {
	
	private Object data;
	private Node NextNode;
	private Node PrevNode;
	
	public Node(Object d)
	{
		data = d;
		NextNode = null;
	}
	
	public boolean hasNext(){
		if(NextNode != null){
			return true;
		}
    	return false;
    }
	
	public boolean hasPrevious(){
    	if(PrevNode != null){
			return true;
		}
    	return false;
    }
	
	public Object getData()
	{
		return data;
	}
	
	public void setDado(Object d)
	{
		this.data = d;
	}
	
	public Node getNextNode()
	{
		return NextNode;
	}
	
	public void setNextNode(Node nextNode)
	{
		this.NextNode = nextNode;
	}

	public Node getPrevNode() {
		return PrevNode;
	}

	public void setPrevNode(Node prevNode) {
		this.PrevNode = prevNode;
	}
	
	public void printNode() {
        System.out.println(data + " ");
    }
}
