package TP;

import java.util.ArrayList;

public class Conjunto<T> {
	private ArrayList<T> datos;
	
	private int indice;
	
	public Conjunto() {
		this.datos = new ArrayList<T>();
	}
	
	public boolean agregar(T elem) {
		if (this.pertenece(elem))
			return false;
		return this.datos.add(elem);
	}
	
	public boolean quitar(T elem) {
		return this.datos.remove(elem);
	}
	
	public boolean pertenece(T elem) {
		return this.datos.contains(elem);
	}

	public int tamanio() {
		return this.datos.size();
	}
	
	public boolean estaVacio() {
		return this.tamanio()==0;
	}

	public T dameUno() {
		if (this.estaVacio()) {
			return null;			//datos.size = 0
		}
		
		if (indice==this.tamanio()) { // 0 <= indice < datos.size()
			indice =0;
		}
		return this.datos.get(indice++);//
	}


}
