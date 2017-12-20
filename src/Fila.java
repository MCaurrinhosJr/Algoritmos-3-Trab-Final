import Pedido;
import Item;

public class Fila {
	
	private Node inicio;  
		
    public Fila() {  
        inicio = null;   
    }  
  
    public void inserir(Object obj) {  
        Node novo = new Node(obj);  
        novo.setNextNode(inicio);  
        inicio = novo;  
    }  
  
    Object remover() {  
        Node temp = inicio;  
        if (temp.getNextNode() != null) {  
            inicio = null;  
            return (temp.getData());  
        }  
        @SuppressWarnings("unused")
		Node prev = temp;  
        while (temp.getNextNode() != null) {  
            prev = temp;  
            temp = temp.getNextNode();  
        }  
        return (temp.getData());  
    }  
  
    public boolean vazia() {  
        return (inicio == null);  
    }
    
    public void display() {
        Node current = inicio;

        while (current != null) {
            current.printNode();
            this.displayObject(current);
            current = current.getNextNode();
        }
    }

    private void displayObject(Node current){
        if(current instanceof Pedido){
        Pedido tempP = (Pedido)current;
            System.out.println("Prato: " + tempP.getNome());
            System.out.println("\nValor: R$" + tempP.getValor().ToString();
            System.out.println("\nDescrição: ");
            System.out.println("\n    " + tempP.getDescricao());
        }
        if(current instanceof item){
            Items tempI = (Items)current;
            System.out.println("Ingrediente: " + tempI.getNome());
            System.out.println("\nDescrição: ");
            System.out.println("\n    " + tempI.getDescricao());
        }
        System.out.println("\n");
    }
}
