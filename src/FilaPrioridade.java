
public class FilaPrioridade {
	
	private Fila list;
	private int size;
	
	
    public FilaPrioridade() {
        list = new Fila();
        int size = 0; 
    	this.size = size;
    }
    
    public boolean isEmpty() {
    	if(size == 0){
    		return true;
    	} else {
    		return false;
    	}
    }

    public void insert(int x) {
        list.inserir(x);
        size++;
        
    }
    
    public void remove() {
        list.remover();
        size--;
    }

    public void displayList() {
        System.out.println("Largest Value to Smallest");
        list.display();
    }
	
	
}
