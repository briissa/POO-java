package Pila;

import java.util.ArrayList;

//¡OJO! Esta es la versión que NO queremos usar.
class PilaDeObjects {
	private ArrayList<Object> elementos = new ArrayList<>();
	
	public void push(Object elemento) {
	   elementos.add(elemento);
	}
	
	public Object pop() {
	   if (elementos.isEmpty()) {
	       System.out.println("Error: La pila está vacía.");
	       return null;
	   }
	   return elementos.remove(elementos.size() - 1);
	}
	
	public boolean isEmpty() {
	   return elementos.isEmpty();
	}
}