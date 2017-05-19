package spacemans_adventures_interface;

public class list_node { // Clase para establecer el contenido de los nodos y los métodos de acceso.

//-----> DECLARACIÓN DE LOS ATRIBUTOS DE LA CLASE.
	  private node info; // 
	  private list_node next;

//-----> DECLARACIÓN DE LOS MÉTODOS DE LA CLASE.
	  
	  public list_node() { // Constructor por defecto.
	    next = null;
	  }

	  public list_node(node o, list_node n) { // Constructor.
	    info = o;
	    setNext(n);
	  }
	  
	  //-----> MÉTODOS SETTERS AND GETTERS.

	  public void setNext(list_node n) { // Método para establecer el nodo siguiente.
	    next = n;
	  }

	  public list_node getNext() { // Método para obtener el nodo siguiente.
	    return next;
	  }

	  public void setInfo(node i) { // Método para establecer la información del nodo.
	    info = i;
	  }
	  
	  public node getInfo() { // Método para obtener la información del nodo.
	    return info;
	  }
}
